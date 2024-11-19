/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unit.projeto;

/**
 *
 * @author 1231146106
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Empregado extends Pessoa {
    private String codigoUniforme;
    private String numeroTelefone;

    public Empregado(String nome, int idade, String sexo, String codigoUniforme, String numeroTelefone) {
        super(nome, idade, sexo);
        setCodigoUniforme(codigoUniforme);
        setNumeroTelefone(numeroTelefone);
    }

    public String getCodigoUniforme() {
        return codigoUniforme;
    }

    public void setCodigoUniforme(String codigoUniforme) {
        if (codigoUniforme == null || codigoUniforme.trim().isEmpty()) {
            throw new IllegalArgumentException("Código do uniforme não pode ser vazio.");
        }
        this.codigoUniforme = codigoUniforme.trim();
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {

        if (numeroTelefone == null || numeroTelefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Número de telefone não pode ser vazio.");
        }
        this.numeroTelefone = numeroTelefone.trim();
    }


    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", codigoUniforme='" + codigoUniforme + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }


    public static Empregado criarEmpregado(Scanner scanner) {
        try {
            System.out.print("Nome do empregado: ");
            String nome = scanner.nextLine();

            System.out.print("Idade do empregado: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Sexo do empregado: ");
            String sexo = scanner.nextLine();

            System.out.print("Código do uniforme: ");
            String codigoUniforme = scanner.nextLine();

            System.out.print("Número de telefone: ");
            String numeroTelefone = scanner.nextLine();

            return new Empregado(nome, idade, sexo, codigoUniforme, numeroTelefone);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar empregado: " + e.getMessage());
            return null;
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Digite os dados corretamente.");
            scanner.nextLine();
            return null;
        }
    }
}
