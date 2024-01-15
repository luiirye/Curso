package pacote.EstruturaCondicional.Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a renda: ");

        double renda = sc.nextDouble();
        
        if (renda > 0.00 && renda < 2000.01) {
            System.out.println("Isento");
        }
        
        else if (renda > 2000.01 && renda < 3000.01) {
            
            renda * 8
            
            System.out.println("calma ai");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        sc.close();
    }
}
