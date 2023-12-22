package pacote.EstruturaCondicional.Exercícios;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro qualquer: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("o número informado é NEGATIVO");
        }
        else{
            System.out.println("o número informado é POSITIVO");
        }
        
        sc.close();
    }
}
