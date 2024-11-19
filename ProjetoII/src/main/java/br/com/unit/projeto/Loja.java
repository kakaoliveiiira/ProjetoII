package br.com.unit.projeto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Loja {
    private ArrayList<Produto> produtos;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Gerente> gerentes;
    private ArrayList<Diretor> diretores;
    private ArrayList<Contador> contadores;
    private ArrayList<Proprietario> proprietarios;
    private Scanner scanner;

    public Loja() {
        produtos = new ArrayList<>();
        funcionarios = new ArrayList<>();
        gerentes = new ArrayList<>();
        diretores = new ArrayList<>();
        contadores = new ArrayList<>();
        proprietarios = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void adicionarGerente(Gerente gerente) {
        this.gerentes.add(gerente);
    }

    public void adicionarDiretor(Diretor diretor) {
        this.diretores.add(diretor);
    }

    public void adicionarContador(Contador contador) {
        this.contadores.add(contador);
    }

    public void adicionarProprietario(Proprietario proprietario) {
        this.proprietarios.add(proprietario);
    }

    public void listarProdutos() {
        produtos.forEach(System.out::println);
    }

    public void listarFuncionarios() {
        funcionarios.forEach(System.out::println);
    }

    public void listarGerentes() {
        gerentes.forEach(System.out::println);
    }

    public void listarDiretores() {
        diretores.forEach(System.out::println);
    }

    public void listarContadores() {
        contadores.forEach(System.out::println);
    }

    public void listarProprietarios() {
        proprietarios.forEach(System.out::println);
    }

    public void executar() {
        int opcao = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Adicionar Funcionário");
            System.out.println("4. Listar Funcionários");
            System.out.println("5. Adicionar Proprietário");
            System.out.println("6. Listar Proprietários");
            System.out.println("7. Adicionar Gerente");
            System.out.println("8. Listar Gerentes");
            System.out.println("9. Adicionar Diretor");
            System.out.println("10. Listar Diretores");
            System.out.println("11. Adicionar Contador");
            System.out.println("12. Listar Contadores");

            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        Produto novoProduto = Produto.criarProduto(scanner);
                        if (novoProduto != null) {
                            adicionarProduto(novoProduto);
                            System.out.println("Produto adicionado: " + novoProduto);
                        }
                        break;
                    case 2:
                        listarProdutos();
                        break;
                    case 3:
                        Funcionario novoFuncionario = Funcionario.criarFuncionario(scanner);
                        if (novoFuncionario != null) {
                            adicionarFuncionario(novoFuncionario);
                            System.out.println("Funcionário adicionado: " + novoFuncionario);
                        }
                        break;
                    case 4:
                        listarFuncionarios();
                        break;
                    case 5:
                        Proprietario novoProprietario = Proprietario.criarProprietario(scanner);
                        if (novoProprietario != null) {
                            adicionarProprietario(novoProprietario);
                            System.out.println("Proprietário adicionado: " + novoProprietario);
                        }
                        break;
                    case 6:
                        listarProprietarios();
                        break;
                    case 7:
                        Gerente novoGerente = Gerente.criarGerente(scanner);
                        if (novoGerente != null) {
                            adicionarGerente(novoGerente);
                            System.out.println("Gerente adicionado: " + novoGerente);
                        }
                        break;
                    case 8:
                        listarGerentes();
                        break;
                    case 9:
                        Diretor novoDiretor = Diretor.criarDiretor(scanner);
                        if (novoDiretor != null) {
                            adicionarDiretor(novoDiretor);
                            System.out.println("Diretor adicionado: " + novoDiretor);
                        }
                        break;
                    case 10:
                        listarDiretores();
                        break;
                    case 11:
                        Contador novoContador = Contador.criarContador(scanner);
                        if (novoContador != null) {
                            adicionarContador(novoContador);
                            System.out.println("Contador adicionado: " + novoContador);
                        }
                        break;
                    case 12:
                        listarContadores();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.next(); 
            }

        } while (opcao != 0);
        scanner.close();
    }

    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.executar();
    }
}
