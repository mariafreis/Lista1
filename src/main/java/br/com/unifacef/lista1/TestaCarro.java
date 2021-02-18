/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author ferdi
 */
public class TestaCarro {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Vamos criar objetos aqui
        //Obj 1
        //Tipo nome = New Tipo()
        Carros obj1 = new Carros();
        //Obj.variavel
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";
        obj1.ano = 2018;
        obj1.motor = false;
        obj1.velAtual = 0;
//Vamos mostrar ao usuario
        System.out.println("Obj1: Ano: " + obj1.ano + " Marca: " + obj1.marca + " Modelo: " + obj1.modelo
                + " Motor: " + obj1.motor + " Velocidade: " + obj1.velAtual);
        JOptionPane.showMessageDialog(null, "Obj1: Ano: " + obj1.ano + " Marca: " + obj1.marca + " Modelo: " + obj1.modelo
                + " Motor: " + obj1.motor + " Velocidade: " + obj1.velAtual);

        //Obj 2
        //Tipo nome = New Tipo()
        Carros obj2 = new Carros();
        //Obj.variavel
        obj2.marca = "Fiat";
        obj2.modelo = "Palio";
        obj2.ano = 2016;
        obj2.motor = true;
        obj2.velAtual = 40;
        System.out.println("Obj2: Ano: " + obj2.ano + " Marca: " + obj2.marca + " Modelo: " + obj2.modelo
                + " Motor: " + obj2.motor + " Velocidade: " + obj2.velAtual);

    }
}
