package pacote.EstruturaCondicional.Exercícios;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro qualquer: ");
        int x = sc.nextInt();
        //int conta = x * x / 2;
        
        if (x %2 == 0) 
            
            System.out.println("O número informado é PAR");
        
        else
            System.out.println("o número informado é ÍMPAR");

        sc.close();
    }
}
