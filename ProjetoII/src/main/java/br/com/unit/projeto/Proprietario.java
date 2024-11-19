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

public class Proprietario extends Pessoa {
    private double valorInvestimento;

    public Proprietario(String nome, int idade, String sexo, double valorInvestimento) {
        super(nome, idade, sexo);
        setValorInvestimento(valorInvestimento); 
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        if (valorInvestimento < 0) {
            throw new IllegalArgumentException("Valor do investimento não pode ser negativo.");
        }
        this.valorInvestimento = valorInvestimento;
    }

    public void displayProprietario() {
        System.out.println("Proprietário: " + getNome() + 
                ", Idade: " + getIdade() +
                ", Sexo: " + getSexo() +
                ", Investimento: " + valorInvestimento);
    }

    @Override
    public String toString() { 
        return "Proprietario{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", valorInvestimento=" + valorInvestimento +
                '}';
    }

    public static Proprietario criarProprietario(Scanner scanner) {
        try {
            System.out.print("Nome do proprietário: ");
            String nome = scanner.nextLine();

            System.out.print("Idade do proprietário: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Sexo do proprietário: ");
            String sexo = scanner.nextLine();

            System.out.print("Valor do investimento: ");
            double valorInvestimento = scanner.nextDouble();
            scanner.nextLine(); 


            return new Proprietario(nome, idade, sexo, valorInvestimento);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar proprietário: " + e.getMessage());
            return null;
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Digite os dados corretamente.");
            scanner.nextLine();
            return null;
        }

    }
}
