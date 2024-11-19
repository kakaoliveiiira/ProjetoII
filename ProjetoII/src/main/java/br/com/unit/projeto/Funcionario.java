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

public class Funcionario extends Empregado {
    private double salario;
    private String turno;
    private int horasTrabalho;

    public Funcionario(String nome, int idade, String sexo, String codigoUniforme, String numeroTelefone, double salario, String turno, int horasTrabalho) {
        super(nome, idade, sexo, codigoUniforme, numeroTelefone);
        setSalario(salario);
        setTurno(turno);
        setHorasTrabalho(horasTrabalho);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (turno == null || turno.trim().isEmpty()) {
            throw new IllegalArgumentException("Turno não pode ser vazio.");
        }
        this.turno = turno.trim();
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        if (horasTrabalho <= 0) {
            throw new IllegalArgumentException("Horas de trabalho devem ser maiores que zero.");
        }
        this.horasTrabalho = horasTrabalho;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", codigoUniforme='" + getCodigoUniforme() + '\'' +
                ", numeroTelefone='" + getNumeroTelefone() + '\'' +
                ", salario=" + salario +
                ", turno='" + turno + '\'' +
                ", horasTrabalho=" + horasTrabalho +
                '}';
    }




    public static Funcionario criarFuncionario(Scanner scanner) {
        try {
            System.out.print("Nome do funcionário: ");
            String nome = scanner.nextLine();

            System.out.print("Idade do funcionário: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Sexo do funcionário: ");
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


            return new Funcionario(nome, idade, sexo, codigoUniforme, numeroTelefone, salario, turno, horasTrabalho);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar funcionário: " + e.getMessage());
            return null;
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Digite os dados corretamente.");
            scanner.nextLine();
            return null;
        }
    }
}
