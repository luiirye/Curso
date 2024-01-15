package pacote.EstruturaCondicional.Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a renda: ");

        double renda = sc.nextDouble();
        
        if (renda >= 0.00 && renda <= 2000.00) {
            System.out.println("Isento");
        }
        
        else if (renda >= 2000.01 && renda <= 3000.00) {
            
          double imposto = 0.08 * renda;
            
            System.out.printf("R$ %.2f%n", imposto);
        }
        
        else if (renda >= 3000.01 && renda <= 4500.00 ) {
            double imposto = 0.18 * renda;

            System.out.printf("R$ %.2f%n", imposto);
        }
        
        else if (renda > 4500.00) {
            double imposto = 0.28 * renda;
            
            System.out.printf("R$ %.2f%n", imposto);
        }
        
        sc.close();
    }
}
