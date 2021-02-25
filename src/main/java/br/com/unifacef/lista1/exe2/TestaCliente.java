/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.lista1.exe2;

/**
 *
 * @author ferdi
 */
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cliente obj1 = new Cliente(1453, 001, "Luciana", (float) 1500.20);
        Cliente obj2 = new Cliente(1589, 001, "Patricia", (float) 1500000.30);
        Cliente obj3 = new Cliente(1845, 001, "Lucas", (float) 200.00);

        System.out.println("\n" + obj1.mostra());
        obj1.realizarDeposito(100);
        System.out.println("\n" + obj1.mostra());
        obj1.realizarSaque((float) 200.5);
        System.out.println("\n" + obj1.mostra());

        System.out.println("\n" + obj2.mostra());
        obj2.realizarDeposito((float) 0.7);
        System.out.println("\n" + obj2.mostra());
        obj2.realizarSaque((float) 500000);
        System.out.println("\n" + obj2.mostra());

        System.out.println("\n" + obj3.mostra());
        obj3.realizarDeposito(1);
        System.out.println("\n" + obj3.mostra());
        obj3.realizarSaque(5000);
        System.out.println("\n" + obj3.mostra());

    }

}
