package pacote.EstruturaSequencial.Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido {
    
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);

      Scanner sc = new Scanner(System.in);

      double largura = sc.nextDouble();
      double comprimento = sc.nextDouble();
      double metroQuadrado = sc.nextDouble();

      double area = largura * comprimento;
      double preco = area * metroQuadrado;

      System.out.println("Area = " + area);
      System.out.println("Preço = " + preco);

      sc.close();
    }
}
