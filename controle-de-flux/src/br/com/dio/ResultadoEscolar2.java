package br.com.dio;

public class ResultadoEscolar2 {
    //Condicional encadeada
    public static void main(String[] args) {
        int nota = 8;

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Prova Recuperação");
        else
            System.out.println("Reprovado");
    }
}
