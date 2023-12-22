package pacote.EstruturaCondicional.Exercícios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro qualquer: ");
        int a = sc.nextInt();
        System.out.println("Informe um outru número inteiro qualquer: ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.println("SÃO MÚLTIMPLOS");
        }
        else{
            System.out.println("NÃO SÃO MÚLTIPLOS");
        }
            
        sc.close();
    }
}
