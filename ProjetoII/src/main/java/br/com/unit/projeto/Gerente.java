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

public class Gerente extends Funcionario {
    private String departamento;
    private String qualificacao;

    public Gerente(String nome, int idade, String sexo, String codigoUniforme, String numeroTelefone, double salario, String turno, int horasTrabalho, String departamento, String qualificacao) {
        super(nome, idade, sexo, codigoUniforme, numeroTelefone, salario, turno, horasTrabalho);
        setDepartamento(departamento);
        setQualificacao(qualificacao);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Departamento não pode ser vazio.");
        }
        this.departamento = departamento.trim();
    }

    public String getQualificacao() {
        return qualificacao;
    }

    public void setQualificacao(String qualificacao) {
        if (qualificacao == null || qualificacao.trim().isEmpty()) {
            throw new IllegalArgumentException("Qualificação não pode ser vazia.");
        }
        this.qualificacao = qualificacao.trim();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", codigoUniforme='" + getCodigoUniforme() + '\'' +
                ", numeroTelefone='" + getNumeroTelefone() + '\'' +
                ", salario=" + getSalario() +
                ", turno='" + getTurno() + '\'' +
                ", horasTrabalho=" + getHorasTrabalho() +
                ", departamento='" + departamento + '\'' +
                ", qualificacao='" + qualificacao + '\'' +
                '}';
    }

    public static Gerente criarGerente(Scanner scanner) {
        try {
            System.out.print("Nome do gerente: ");
            String nome = scanner.nextLine();

            System.out.print("Idade do gerente: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Sexo do gerente: ");
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

            System.out.print("Departamento: ");
            String departamento = scanner.nextLine();

            System.out.print("Qualificação: ");
            String qualificacao = scanner.nextLine();

            return new Gerente(nome, idade, sexo, codigoUniforme, numeroTelefone, salario, turno, horasTrabalho, departamento, qualificacao);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar gerente: " + e.getMessage());
            return null;
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Digite os dados corretamente.");
            scanner.nextLine(); 
            return null;
        }
    }
}
