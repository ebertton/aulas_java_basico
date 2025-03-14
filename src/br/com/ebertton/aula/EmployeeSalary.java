package br.com.ebertton.aula;

import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Informe seu nome ");
        String name = scanner.nextLine();
        System.out.print("Informe seu Salario ");

        if (scanner.hasNextDouble()) {
            double salary = scanner.nextDouble();
            System.out.println("O salário de " + name + " é: " + salary);
        } else {
            System.out.println("Salário inválido");
        }

        scanner.close();
    }
    
}
