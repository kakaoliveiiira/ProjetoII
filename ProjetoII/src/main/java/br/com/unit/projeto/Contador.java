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

public class Contador extends Funcionario {

    public Contador(String nome, int idade, String sexo, String codigoUniforme, String numeroTelefone, double salario, String turno, int horasTrabalho) {
        super(nome, idade, sexo, codigoUniforme, numeroTelefone, salario, turno, horasTrabalho);
    }

    @Override
    public String toString() {
        return "Contador{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", codigoUniforme='" + getCodigoUniforme() + '\'' +
                ", numeroTelefone='" + getNumeroTelefone() + '\'' +
                ", salario=" + getSalario() +
                ", turno='" + getTurno() + '\'' +
                ", horasTrabalho=" + getHorasTrabalho() +
                '}';
    }

    public static Contador criarContador(Scanner scanner) {
        try {
            System.out.print("Nome do contador: ");
            String nome = scanner.nextLine();

            System.out.print("Idade do contador: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Sexo do contador: ");
            String sexo = scanner.nextLine();

            System.out.print("Código do uniforme: ");
            String codigoUniforme = scanner.nextLine();

            System.out.print("Número de telefone: ");
            String numeroTelefone = scanner.nextLine();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Turno: ");
            String turno = scanner.nextLine();

            System.out.print("Horas de trabalho: ");
            int horasTrabalho = scanner.nextInt();
            scanner.nextLine();

            return new Contador(nome, idade, sexo, codigoUniforme, numeroTelefone, salario, turno, horasTrabalho);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar contador: " + e.getMessage());
            return null;
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Digite os dados corretamente.");
            scanner.nextLine();
            return null;
        }
    }
}
