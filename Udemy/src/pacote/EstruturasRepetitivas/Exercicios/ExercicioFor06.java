package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class ExercicioFor06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int div = 0;



        for (int i = 1; i != n; i++){

            div = n % 2;

        }

        System.out.println(div);
        



        sc.close();
    }
}
