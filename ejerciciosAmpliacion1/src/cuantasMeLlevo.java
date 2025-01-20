import java.util.ArrayList;
import java.util.List;

public class cuantasMeLlevo {
    public static void main(String[] args) {

        System.out.println(calcular(123,456));//0
        System.out.println(calcular(555,555));//3
        System.out.println(calcular(123,594));//1
        System.out.println(calcular(99,1));//1

    }

public static int calcular(int num1,int num2) {

    List<String> sumando1 = new ArrayList<>(List.of(String.valueOf(num1).split("")));

    List<String> sumando2 = new ArrayList<>(List.of(String.valueOf(num2).split("")));

    int llevadas = 0;

    while (sumando1.size() > sumando2.size()) {
        sumando2.addFirst("0");
    }

    while (sumando2.size() > sumando1.size()) {
        sumando1.addFirst("0");
    }


    for (int i = 0; i < sumando1.size(); i++) {

        if (Integer.valueOf(sumando1.get(i)) + Integer.valueOf(sumando2.get(i)) > 9) {
            llevadas++;
        }


    }

    return llevadas;

}
}
