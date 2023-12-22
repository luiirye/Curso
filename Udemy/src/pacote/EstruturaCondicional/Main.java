package pacote.EstruturaCondicional;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x;
     
        System.out.println("Dê uma nota de 1 a 10 para esse café");
        x = sc.nextInt();

        if (x <= 5){
            System.out.println("O Café estava tão ruim assim? :(");
        }
        else if (x <= 8) {
            System.out.println("Estava bom, mas nem tanto.");
        }
            
        else if (x <= 10) {
            System.out.println("O café estava maravilhoso :D");
        }
        else if (x > 10);
            System.out.println("É para escolher uma nota de 0 a 10, burro");
        
        sc.close();    
    }
}

