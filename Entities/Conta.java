package Entities;

public class Conta {
    
    private String nome;
    private int senha;
    private Status status;

    public Conta(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
        this.status = null;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}
