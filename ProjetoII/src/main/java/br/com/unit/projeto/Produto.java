package br.com.unit.projeto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Produto implements Item {
    private String nome;
    private int id;
    private double preco;
    private String categoria;
    private int quantidade;

    public Produto(String nome, int id, double preco, String categoria, int quantidade) {
        setNome(nome);
        setId(id);
        setPreco(preco);
        setCategoria(categoria);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID do produto deve ser maior que zero.");
        }
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço do produto não pode ser negativo.");
        }
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.trim().isEmpty()) {
            throw new IllegalArgumentException("Categoria do produto não pode ser vazia.");
        }
        this.categoria = categoria.trim();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }
        this.quantidade = quantidade;
    }

    @Override
    public void displayItem() {
        System.out.println("Produto: " + nome + ", ID: " + id +
                ", Preço: " + preco + ", Categoria: " + categoria + ", Quantidade: " + quantidade);
    }

    @Override
    public double calcularPrecoTotal() {
        return preco * quantidade;
    }

    @Override
    public String obterDescricao() {
        return "Produto " + nome + " (ID: " + id + ") - Categoria: " + categoria;
    }

    @Override
    public int obterQuantidade() {
        return quantidade;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido.");
        }
        preco -= preco * (percentual / 100);
    }
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    public static Produto criarProduto(Scanner scanner) {
        try {
            System.out.print("Nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("ID do produto: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Preço do produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Categoria do produto: ");
            String categoria = scanner.nextLine();

            System.out.print("Quantidade do produto: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); 

            return new Produto(nome, id, preco, categoria, quantidade);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Erro ao criar o produto: " + e.getMessage());
            scanner.nextLine();
            return null;
        }
    }
}
