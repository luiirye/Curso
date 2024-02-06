package pacote.EstruturasRepetitivas.For;

import java.util.Scanner;

public class Exemplo01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;
            // inicio: criei a variável i recebendo 0.
            // meio: i tem que ser menor que a variável N.
            // final: i vai somando com +1;
        for (int i = 0 ; i < N ; i++ ) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        
        System.out.println(soma);
        
        sc.close();
    }
}
