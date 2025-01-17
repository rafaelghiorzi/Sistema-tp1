/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.Status;
import enums.Unidade;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class Aluno extends Pessoa implements Autenticavel {
    protected float mensalidade;
    protected ArrayList<Reserva> reservas;

    public Aluno(String nome, String cpf, char sexo, String email, String celular, String senha, Unidade unidade, float mensalidade) {
        super(nome, cpf, sexo, email, celular, senha, unidade);
        this.mensalidade = mensalidade;
        this.reservas = new ArrayList<>();
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
    
    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    // Funções auxiliares
    public void criarReserva(Aula aula) {
        for (Reserva reserva : reservas) {
            if (reserva.getAula().equals(aula)) {
                System.out.println("Você já tem uma reserva para essa aula.");
                return;
            }
        }
        Reserva novaReserva = new Reserva(Status.Pendente, this, aula);
        reservas.add(novaReserva);
    }

    public void confirmarReserva(Reserva reserva) {
        reserva.setStatus(Status.Confirmada);
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.setStatus(Status.Cancelada);
    }
}