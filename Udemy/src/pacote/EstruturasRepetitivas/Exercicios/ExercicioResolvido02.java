package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;
        int cont = 0;

        while (x >= 0) {  
            soma = soma + x;
            cont = cont + 1;
            x = sc.nextInt();
        }
    
        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("%.2f%n", media);
        }
    
        else {
            System.out.println("impossível calcular");
        }

        sc.close();
    }
}