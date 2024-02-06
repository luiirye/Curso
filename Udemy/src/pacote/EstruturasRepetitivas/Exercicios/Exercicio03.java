package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        while (codigo != 4) {
            
            if (codigo == 1) {
                gasolina = gasolina + 1;
            }
        
            else if (codigo == 2) {
                alcool = alcool + 1;
            }
        
            else if (codigo == 3) {
                diesel  = diesel + 1;
            }
                
            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Alcool: " + alcool);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
    }
}
