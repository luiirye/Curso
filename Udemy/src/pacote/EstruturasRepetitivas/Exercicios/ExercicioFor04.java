package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class ExercicioFor04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double numerador = sc.nextInt();
            double denominador = sc.nextInt();

            if (numerador != 0 && denominador != 0) {
                double divisao = numerador / denominador;
                System.out.println(divisao);
            }

            else if (numerador == 0 && denominador != 0) {
                double divisao = numerador / denominador;
                System.out.println(divisao);
            }
        
            else {
                System.out.println("divisao impossível");
            }
        }

        sc.close();
    }
}
