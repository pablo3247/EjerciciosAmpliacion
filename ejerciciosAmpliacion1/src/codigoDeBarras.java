import java.sql.SQLOutput;
import java.util.List;

public class codigoDeBarras {
    public static void main(String[] args) {
        String codigoBarra = "5029365779425"; //true
        System.out.println(check(codigoBarra));
    }

    public static boolean check(String codigo){
        List<String> calcular = List.of(codigo.split(""));

        int pares =0;
        int impares=0;

        for (int i = calcular.size()-2; i >=0; i=i-2) {
            impares=(Integer.valueOf(calcular.get(i)) *3) + impares;
        }

        for (int i = calcular.size()-3; i >=0 ; i=i-2) {
            pares= Integer.valueOf(calcular.get(i)) + pares;
        }


        int suma = pares +impares;

        int multiploCercano =suma;
        while(multiploCercano%10 !=0){
            multiploCercano++;
        }

        return multiploCercano-suma == Integer.valueOf(calcular.getLast());
    }
}
