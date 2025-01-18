import java.util.ArrayList;
import java.util.List;

public class numeroArmstrong {
    public static void main(String[] args) {

        System.out.println(armstrong(370)); //true
        System.out.println(armstrong(371)); //true
        System.out.println(armstrong(407)); //true
        System.out.println(armstrong(698)); //false

    }

    public static boolean armstrong(int numero){

        List<String> numeros = new ArrayList(List.of(String.valueOf(numero).split("")));

        double resultado = numeros.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .mapToDouble(s -> Math.pow(s,numeros.size()))
                .sum();
        return numero == (int)resultado;
    }
}
