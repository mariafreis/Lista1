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
public class Aluno {

    int numeroAluno;
    String nome;
    int idade;
    float p1;
    float p2;
    float mf;

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
        this.mf = mf;
    }

    public Aluno() {

    }

    public void notaFinal() {
        this.mf = (this.p1 + this.p2) / 2;
        System.out.println("Media final: " + mf);
    }

    public void dadosAluno() {
        System.out.println("Nome: " + this.nome + "\nNúmero do aluno: " + this.numeroAluno
                + "\nIdade: " + this.idade);
    }

    public void passou() {
        if (this.mf > 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}






