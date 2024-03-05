import br.com.ex.alura.encapsulamento.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ex01_ContaBancaria
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Matheus Bueno";
        conta.setNumeroConta(7522);
        conta.setSaldo(1200);
        System.out.println("Titular da conta: " + conta.titular);
        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println("\n");


        //ex02_IdadePessoa
        IdadePessoa idade = new IdadePessoa();
        idade.setNome("Matheus");
        idade.setIdade(17);
        System.out.println("Nome da pessoa: " + idade.getNome());
        System.out.println("Idade da pessoa: " + idade.getIdade());
        idade.verificarIdade();
        System.out.println("\n");


        //ex03_Produto
        Produto produto = new Produto();
        produto.setNome("Monitor 144hz");
        produto.setPreco(425.00);
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preco do produto: " + produto.getPreco());
        System.out.println("Mas com o desconto de 40% o preco atual e de: " + produto.aplicarDesconto());
        System.out.println("\n");


        //ex04_Aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Matheus");
        aluno.setNota1(4.7);
        aluno.setNota2(5.9);
        aluno.setNota3(10.0);

        System.out.println("Primeira nota do aluno: " + aluno.getNota1() + ", segunda nota " + aluno.getNota2() +
                            ", terceira nota: " + aluno.getNota3());
        System.out.println("Media de notas do aluno: " + aluno.calcularMedia());
        System.out.println("\n");


        //ex05_Livro
        Livro livro = new Livro();
        livro.setAutor("Wilian Gibson");
        livro.setTitulo("Neuromancer");
        livro.exibirDetalhes();
    }
}