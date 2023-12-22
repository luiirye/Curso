package pacote.EstruturaCondicional.Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        
        System.out.println("Informe a primeira nota do Aluno: ");
        double nota1 = sc.nextDouble();
        System.out.println("informe a segunda nota do Aluno: ");
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;

        System.out.printf("Nota final = %.1f%n", notaFinal);
    
        if (notaFinal < 60.0){
            System.out.println("Reprovado");
        }
        
        else{
            System.out.println("Aprovado");
        }
        
        sc.close();
    }
}
