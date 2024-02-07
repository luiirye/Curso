package pacote.EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class ExercicioWhile01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 2002 || x == 2002) {
            if (x == 2002) {
                System.out.println("Acesso permitido");
                break;
            }

            else{
                System.out.println("Senha inválida");
            }
            x = sc.nextInt();
        }
        
        sc.close();
    }
}
