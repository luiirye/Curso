package pacote.EstruturasRepetitivas.For;

public class contagemForProgressiva {
    public static void main(String[] args) {
        
        int i = 0;
        // a estrutura "for" iniciou com i = 0, a condição seguinte foi de que i é menor do que o número estabelecido, e o incremento foi de i++, que é o mesmo de
        // i = i + 1, assim a estrutura vai somando um até que i seja menor do que 1001.
        for (i = 0 ; i < 1001 ; i++) {
            System.out.println("i: " + i);
        }
    }
}
