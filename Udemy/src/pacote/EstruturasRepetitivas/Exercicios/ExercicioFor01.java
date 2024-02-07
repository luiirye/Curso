package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class ExercicioFor01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (x = x + 0; x <= 1000 ; x = x % 2 ) {
            
            System.out.println(x);
        }
        
    
    
    
    
    
    
    
    
        sc.close();
    }
}
