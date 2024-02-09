package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercícioFor03 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        double media1 = 0;
        double media2 = 0;
        double media3 = 0;

        for (int i = 0; i < n ; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            media1 = (x + 2 + y + 3 + z + 5) / n;  

            
        }
        
        System.out.println(media1);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        sc.close();
    }
}
