package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class ExercicioResolvidoFor02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        sc.close();
        
        for (int i = 1; i <= 10 ; i++) {   
            int produto = i * N;
            System.out.println(i + " x " + N + " = " + produto);
        }
    
    }
}
