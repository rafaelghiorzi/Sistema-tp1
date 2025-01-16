/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.security.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class Aula {
    protected String nome;
    protected int capacidade;
    protected int comissaoFixa;
    protected String detalhes;
    protected Timestamp data; // Alterado para Timestamp
    protected Professor professor;
    protected ArrayList<Reserva> reservas;

    public Aula(String nome, int capacidade, int comissaoFixa, String detalhes, Timestamp data, Professor professor) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.comissaoFixa = comissaoFixa;
        this.detalhes = detalhes;
        this.data = data;
        this.professor = professor;
        this.reservas = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getComissaoFixa() {
        return comissaoFixa;
    }

    public void setComissaoFixa(int comissaoFixa) {
        this.comissaoFixa = comissaoFixa;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    // Função para exibir detalhes da aula
    public void exibirDetalhes() {
        System.out.println("Aula: " + nome);
        System.out.println("Data: " + data);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Detalhes: " + detalhes);
    }

    // Calcular comissão
    public float calcularComissao(Professor professor) {
        // Assumindo que cada reserva gera um valor (exemplo de cálculo)
        return comissaoFixa * 0.01f; // exemplo: 2% de comissão
    }
}

