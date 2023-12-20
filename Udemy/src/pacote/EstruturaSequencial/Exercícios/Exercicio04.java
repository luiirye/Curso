package pacote.EstruturaSequencial.Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int numeroFuncionario;
        double horasTrabalhadas, valorHora, salarioHoras;

        System.out.println("Informe o número do funcionário: ");
        numeroFuncionario = sc.nextInt();
        System.out.println("Informe as horas trabalhadas desse funcionário: ");
        horasTrabalhadas = sc.nextDouble();
        System.out.println("Informe o valor de horas trabalhadas: ");
        valorHora = sc.nextDouble();
        
        salarioHoras  = horasTrabalhadas * valorHora;
        
        System.out.println("Número do funcionário = " + numeroFuncionario);
        System.out.printf("Salário do funcionário = " + "R$ %.2f%n", salarioHoras);

        sc.close();
    }
}

