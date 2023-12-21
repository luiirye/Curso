package pacote.EstruturaSequencial.Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int codigoPeca1, numerosPeca1, codigoPeca2, numerosPeca2;
        double valorUnitario1, valorUnitario2, valorTotal;

        System.out.println("Informe o código da peça e a quantidade de peças: ");
        codigoPeca1 = sc.nextInt();
        numerosPeca1 = sc.nextInt();
        valorUnitario1 = sc.nextDouble();
        
        System.out.println("Informe o código da peça e a quantidade de peças:");
        codigoPeca2 = sc.nextInt();
        numerosPeca2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();

        valorTotal = valorUnitario1 * numerosPeca1 + valorUnitario2 * numerosPeca2;

        System.out.println("Peça: " + codigoPeca1);
        System.out.println("Peça: " + codigoPeca2);
        System.out.printf("Valor a Pagar: R$ %.2f%n",valorTotal);

        sc.close();
    }
}
