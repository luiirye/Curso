package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercícioFor03 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        double cA = 0;
        double cB = 0;
        double cC = 0;
       
        for (int i = 0; i < n; i++) {
            
            cA = sc.nextDouble();
            cB = sc.nextDouble();
            cC = sc.nextDouble();

            double media = ((cA * 2.0 + cB * 3.0 + cC *5)/ 10.0);
           
            System.out.printf("%.1f%n", media);
        }
        
        sc.close();
    }
}