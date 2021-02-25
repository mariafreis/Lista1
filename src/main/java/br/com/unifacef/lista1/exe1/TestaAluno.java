/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.lista1.exe1;

/**
 *
 * @author ferdi
 */
public class TestaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Aluno obj1 = new Aluno(1, "João", 16, 6, (float) 7.5);
        Aluno obj2 = new Aluno(2, "Leticia", 17, 10, (float) 8.5);
        Aluno obj3 = new Aluno(3, "Maria", 16, 8, (float) 4.5);

        obj1.dadosAluno();
        obj1.notaFinal();
        obj1.passou();

        obj2.dadosAluno();
        obj2.notaFinal();
        obj2.passou();

        obj3.dadosAluno();
        obj3.notaFinal();
        obj3.passou();

    }

}
