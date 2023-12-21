package pacote.EstruturaSequencial.Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
          
        float A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double pi = 3.14159;
        
        System.out.println("Informe valores para A, B, e C.");
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        areaTriangulo = A * C /2;
        areaCirculo = (float) pi * (C * C);
        areaTrapezio = (A + B) * C / 2;
        areaQuadrado = B * B;
        areaRetangulo = A * B; 

        System.out.printf("Área do Triângulo: %.3f%n", areaTriangulo);
        System.out.printf("Área do Triângulo: %.3f%n", areaCirculo);
        System.out.printf("Área do Triângulo: %.3f%n", areaTrapezio);
        System.out.printf("Área do Triângulo: %.3f%n", areaQuadrado);
        System.out.printf("Área do Triângulo: %.3f%n", areaRetangulo);        

        sc.close();
    }
}
