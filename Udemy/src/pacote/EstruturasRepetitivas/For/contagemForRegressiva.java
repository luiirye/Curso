package pacote.EstruturasRepetitivas.For;

public class contagemForRegressiva {
    public static void main(String[] args) {
        
        int i = 0;
        
        // Aqui declarei a variável "i" com valor 0, no início do "for" coloquei a variável "i" recebendo valor 100, na condição seguinte, coloquei que ela deveria ser maior ou igual a zero.
        // no incremente, coloquei para ficar subtraindo 1 até chegar a zero, para concluir a condição.

        for (i = 100 ; i >= 0 ; i-- ){
            System.out.println("i: " + i);
        }
    }
}
