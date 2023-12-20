package pacote.EstruturaSequencial.Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        double raio;
        raio = sc.nextDouble();
        double A = Math.pow(raio, 2);
        double pi = 3.14159;
        double area = pi * A;
        
        //Poderia ter sido escrito da seguinte forma:
        
        // double raio, area, pi = 3.14159;
        // raio = sc.nextDouble();
        // area = pi * raio * raio;

        System.out.printf("Valor da Área = %.4f%n", area);
        
        sc.close();
    }
}
