package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class ExercicioFor01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
    
        sc.close();
    
        for (int i = 1 ; i < x ; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
            }   
        }
    }
}

// O que exatamente eu fiz?
// 1° declarei a variável X como scanner para digitar um valor e guardar na variável para usar depois.
// 2° com a estrutura "for" (criei uma variável "i" recebendo valor 0 ; coloquei como condição repetir a estrutura enquanto "i" for menor a 8 ; incrementando 1 até chegar no final da condição) 
// 3° "if" com a condição se o resto (%) de "i" for igual a 1, imprimir os valores.