/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.Unidade;

/**
 *
 * @author rafae
 */
public abstract class Pessoa {
    protected String nome;
    protected int cpf; // CPF como ID único
    protected char sexo; // 'h' ou 'm'
    protected String email; // checar se existe "@" no email
    protected int celular; // 11 dígitos
    protected String senha;
    protected Unidade unidade;

    public Pessoa(String nome, int cpf, char sexo, String email, int celular, String senha, Unidade unidade) {
        // Validação do CPF deve ocorrer aqui ou em outro lugar, dependendo do contexto
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
        this.celular = celular;
        this.senha = senha;
        this.unidade = unidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
}

