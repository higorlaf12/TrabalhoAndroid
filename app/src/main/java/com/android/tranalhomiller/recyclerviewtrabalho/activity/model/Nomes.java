package com.android.tranalhomiller.recyclerviewtrabalho.activity.model;

public class Nomes {

    private String nome;
    private String cpf;
    private String ano;

    public Nomes(){}

    public Nomes(String nome, String cpf, String ano) {
        this.nome = nome;
        this.cpf = cpf;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
