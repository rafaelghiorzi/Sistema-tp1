/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.Especialidade;
import enums.Unidade;
import java.security.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class Professor extends Pessoa {
    protected Especialidade especialidade;
    protected float salario;
    protected ArrayList<Aula> aulas;
    protected boolean admin;

    public Professor(String nome, int cpf, char sexo, String email, int celular, String senha, Unidade unidade,
                     Especialidade especialidade, float salario, boolean admin) {
        super(nome, cpf, sexo, email, celular, senha, unidade);
        this.especialidade = especialidade;
        this.salario = salario;
        this.aulas = new ArrayList<>();
        this.admin = admin;
    }

    // Getters e Setters
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
    }

    public void editarAula(Aula aula, Timestamp novaData, String novoNome, int novaCapacidade, int novaComissaoFixa, String novosDetalhes) {
        aula.setData(novaData);
        aula.setNome(novoNome);
        aula.setCapacidade(novaCapacidade);
        aula.setComissaoFixa(novaComissaoFixa);
        aula.setDetalhes(novosDetalhes);
    }

    public void excluirAula(Aula aula) {
        aulas.remove(aula);
    }

    public void gerarRelatorioSalario() {
        float salarioTotal = salario;
        for (Aula aula : aulas) {
            salarioTotal += aula.calcularComissao(this); // Supondo que Aula tenha esse método
        }
        System.out.println("Salário total do professor: " + salarioTotal);
    }

    // fazer relatório?
}


