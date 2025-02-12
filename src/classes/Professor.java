/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.Especialidade;
import enums.Unidade;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.InputMismatchException;
import static telas.TelaInicial.listaAulas;

/**
 *
 * @author rafae
 */
public class Professor extends Pessoa implements Autenticavel {
    protected Especialidade especialidade;
    protected float salario;
    protected ArrayList<Aula> aulas;
    protected boolean admin;

    public Professor(String nome, String cpf, char sexo, String email, String celular, String senha, Unidade unidade,
                     Especialidade especialidade, float salario, boolean admin) {
        super(nome, cpf, sexo, email, celular, senha, unidade);
        this.especialidade = especialidade;
        this.salario = salario;
        this.aulas = new ArrayList<>();
        this.admin = admin;
    }
    
    // construtor principalmente pro admin aqui
    public Professor(String nome, String email, String senha, boolean admin) {
        super(nome, "admin", 'H', email, "61991307015" ,senha, null);
        this.especialidade = Especialidade.Musculacao;
        this.unidade = Unidade.Geral;
        this.salario = 0;
        this.aulas = new ArrayList<>();
        this.admin = admin;
    }

    // Getters e Setters
    @Override
    public String getCPF() {
        return this.cpf;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }    

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    // Funções auxiliares
    public void criarAula(Aula aula) {
        for (Aula a : aulas) {
            if (a.getData().equals(aula.getData())) {
                System.out.println("Já existe uma aula nesse horário na unidade " + this.unidade);
                return;
            }
        }
        aulas.add(aula);
        listaAulas.add(aula);
    }

    public void editarAula(Aula aula, Timestamp novaData, String novoNome, int novaCapacidade, int novaComissao, String novosDetalhes) {
        aula.setData(novaData);
        aula.setNome(novoNome);
        aula.setCapacidade(novaCapacidade);
        aula.setcomissao(novaComissao);
        aula.setDetalhes(novosDetalhes);
    }

    public void excluirAula(Aula aula) {
        aulas.remove(aula);
    }

    public float gerarSalarioTotal() {
        float salarioTotal = salario;
        for (Aula aula : aulas) {
            salarioTotal += aula.calcularComissao(this); // Supondo que Aula tenha esse método
        }
        return salarioTotal;
    }

    // fazer relatório?
    
    public boolean validarCPF(String CPF) {
        // função de checar por CPF válido, copiado de https://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097
            if 
           (CPF.equals("00000000000") || CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
           (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere "0" no inteiro 0
        // (48 eh a posicao de "0" na tabela ASCII)
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }     
        
    }
}


