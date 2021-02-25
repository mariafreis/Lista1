/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.lista1.exe2;

import javax.swing.JOptionPane;

/**
 *
 * @author ferdi
 */
public class Cliente {

    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;

    public Cliente() {

    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float x) {
        this.saldo = this.saldo + x;
        System.out.println("\nDeposito realizado com sucesso. ");
    }

    public void realizarSaque(float x) {
        if (this.saldo < x) {
            String aux = JOptionPane.showInputDialog("Saldo Insuficiente para saque, insira um novo valor: ");
            var saque = Float.parseFloat(aux);
            this.saldo = this.saldo - saque;
            System.out.println("\nSaque realizado com sucesso. ");
        } else {
            this.saldo = this.saldo - x;
            System.out.println("\nSaque realizado com sucesso. ");
        }
    }

    public String mostra() {
        return "Número da conta: " + this.numeroConta + "\nNome: " + this.nome
                + "\nSaldo: " + this.saldo;
    }
}
