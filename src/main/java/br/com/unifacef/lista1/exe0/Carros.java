/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.lista1.exe0;

import javax.swing.JOptionPane;

/*@author ferdi*/
//serve apenas de modelo
public class Carros {
//declaração das variáveis
//Java possui tipagem estática, é forte

    String marca;//String é uma classe(maiusculo)
    String modelo;//String é uma classe(maiusculo)
    int ano;//int é um tipo primitivo
    boolean motor;
    float velAtual;
//esse é o metodo construtor

    public Carros(int ano, String marca, String modelo, boolean motor, float velAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.velAtual = velAtual;

    }

    public Carros() {

    }

    public void mostra() {
        System.out.println("ObjAno: " + this.ano + " Marca: " + this.marca + " Modelo: " + this.modelo
                + " Motor: " + this.motor + " Velocidade: " + this.velAtual);
    }

    public void mostraPane() {
        JOptionPane.showMessageDialog(null, " Ano: " + this.ano + " \nMarca: "
                + this.marca + " \nModelo: " + this.modelo + " \nMotor: " + this.motor
                + " \nVelocidade: " + this.velAtual);
    }

    public void desligar() {
        if (this.motor) {
            this.motor = false;
            this.velAtual = 0;
        }
    }

    public void acelerar(float x) {
        if (this.motor) {
            this.velAtual = this.velAtual + x;
        }
    }

    public void frear(float x) {
        if (this.motor) {
            this.velAtual = this.velAtual - x;
        }
    }
}
