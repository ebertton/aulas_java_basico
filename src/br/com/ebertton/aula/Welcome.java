package br.com.ebertton.aula;

import java.util.Scanner;

public class Welcome {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é seu nome? ");

        String nome  = scanner.nextLine();

        System.out.print("Bem-vindo: " + nome);
    }

}