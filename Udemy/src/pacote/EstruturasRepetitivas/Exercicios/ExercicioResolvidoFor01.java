package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class ExercicioResolvidoFor01 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
       
        int x = sc.nextInt();
        int y = sc.nextInt();
       
        sc.close();

        int min, max;
       
        if (x < y) {
            min = x;
            max = y;
        }
       
        else {
            min = y;
            max = x;
        }
       
        int i = 0;
        int soma = 0;
        for(i = min + 1; i < max; i++ ) {
            if(i % 2 != 0) {
                soma = soma + i;
            }
        }
        
        System.out.println(soma);

    }
}
