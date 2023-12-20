package pacote.EstruturaSequencial.Exercícios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A, B, C, D;

        System.out.println("Informe o valor de A:");
        A = sc.nextInt();
        System.out.println("Informe o valor de B:");
        B = sc.nextInt();
        System.out.println("Informe o valor de C");
        C = sc.nextInt();
        System.out.println("Informe o valor de D:");
        D = sc.nextInt();

        int diferenca = ((A * B) - (C * D));
        System.out.println("Diferença entre os dois produtos = " + diferenca);

        sc.close();
    }
}
