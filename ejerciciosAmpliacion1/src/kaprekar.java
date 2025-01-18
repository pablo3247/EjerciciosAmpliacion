import java.util.ArrayList;
import java.util.List;

public class kaprekar {
    public static void main(String[] args) {

        System.out.println("Necesita "+kaprekar(1121)+" iteraciones");
    }

    public static int kaprekar(int num){

        List<String> numeros = new ArrayList<>(List.of(String.valueOf(num).split("")));

        String ascendente="";
        String descendente="";
        String resultado="0";
        int resultadoResta=0;

        int iteraciones=0;

        while(!resultado.equals("6174")){

            if(numeros.size()<4){
                System.out.println("Ingresa un numero con 4 cifras!");
                break;
            }

            ascendente = numeros.stream()
               .sorted((a,b) -> Integer.valueOf(a)-Integer.valueOf(b))
                .reduce("",(a,b)-> a+b);

            descendente = numeros.stream()
                        .sorted((a,b)->Integer.valueOf(b)-Integer.valueOf(a))
                                .reduce("",(a,b)->a+b);


            int numAsc = Integer.parseInt(ascendente);
            int numDesc = Integer.parseInt(descendente);

            if(numDesc>numAsc) {
                resultadoResta = numDesc - numAsc;
            } else if (numDesc<numAsc) {
                resultadoResta = numAsc -numDesc;
            }

            resultado = String.valueOf(resultadoResta);

            numeros = new ArrayList<>(List.of(resultado.split("")));

            if(numeros.size()< 4){
                numeros.addFirst("0");
            }

            System.out.println(descendente+" - "+ ascendente+" = "+resultado);

            if(resultadoResta==0){
                System.out.println("Ingresa un numero valido!");
                break;
            }
            iteraciones++;

        }
        return iteraciones;
    }
}
