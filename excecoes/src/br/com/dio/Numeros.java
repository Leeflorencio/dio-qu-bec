package br.com.dio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um número inteiro");
            int numb = scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Digite apenas números inteiros");
        }
    }
}
