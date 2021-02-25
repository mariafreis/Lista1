/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.lista1.exe0;

public class TestaCarro {

    
public static void main(String[] args) {

// vamos criar os 3 objetos aqui
        // obj1
        // Tipo nome = new Tipo()
        Carros obj1 = new Carros();
        // objeto.variavel
        obj1.ano = 2018;
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";
        obj1.motor = false;
        obj1.velAtual = 0;
        // vamos mostrar ao usuário

        obj1.mostra();
        obj1.mostraPane();

        // criar um objeto significa chamar seu método construtor
        Carros obj2 = new Carros(2016, "Fiat", "Palio", true, 40);
        obj2.mostra();
        obj2.mostraPane();

        Carros obj3 = new Carros(2021, "Farrari", "Sport 6", false, 0);
        obj3.mostra();
        obj3.mostraPane();
    }
}
