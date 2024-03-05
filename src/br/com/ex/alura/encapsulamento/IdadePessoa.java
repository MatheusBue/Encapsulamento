package br.com.ex.alura.encapsulamento;

public class IdadePessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade < 18) {
            System.out.println("Voce nao e maior de idade: ");
        } else {
            System.out.println("Voce e maior de idade: ");
        }
    }
}
