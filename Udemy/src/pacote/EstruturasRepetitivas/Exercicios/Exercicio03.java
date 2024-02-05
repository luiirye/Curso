package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0; 
        
        
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        while (codigo > 0) {
           
            if (codigo >= 5) {
                
                codigo = sc.nextInt(); 

            }
            
            else if (codigo == 1) {
                alcool = quantidade + alcool;    
            }

            else if (codigo == 2) {
                gasolina = quantidade + gasolina;
            }
        
            else if (codigo == 3) {
                diesel = quantidade + diesel;
            }
        
            else { 
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
            }
            
            codigo = sc.nextInt();
            quantidade = sc.nextInt();

        }
        
        codigo = sc.nextInt();
        quantidade = sc.nextInt();
        
        sc.close();
    }
}
