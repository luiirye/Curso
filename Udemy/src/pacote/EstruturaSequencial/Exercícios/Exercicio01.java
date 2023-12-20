package pacote.EstruturaSequencial.Exercícios;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe o valor para X;");
        int x = sc.nextInt();
        System.out.println("Informe o valor para Y:");
        int y = sc.nextInt();

        int soma = x + y;

        System.out.println("O valor da soma é: " + soma);

        sc.close(); 
    }
}
