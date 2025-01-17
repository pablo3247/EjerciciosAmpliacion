import java.util.ArrayList;
import java.util.List;

public class luckyNumber {
    public static void main(String[] args) {

        String fechaNacimiento = "18-04-2006";

        int luckyNumber = calcuclarNumeroLucky(fechaNacimiento);

        System.out.println(luckyNumber);
    }

    public  static int calcuclarNumeroLucky(String fechaNacimiento){
        List<String> lista = new ArrayList<>(List.of(fechaNacimiento.split("")));

        int sum =10;

        while(sum > 9) {

            sum = lista.stream()
                    .filter(s -> !s.equals("-"))
                    .mapToInt(s -> Integer.valueOf(s))
                    .reduce(0, (previousSum, value) -> previousSum + value);

            lista = new ArrayList<>(List.of(String.valueOf(sum).split("")));
        }

        return sum;

    }
}
