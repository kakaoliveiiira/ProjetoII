/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.unit.projeto;

/**
  * @author 1231146106
 */

public interface Item {
    void displayItem();
    double calcularPrecoTotal();
    String obterDescricao();
    int obterQuantidade();
    void aplicarDesconto(double percentual);
}