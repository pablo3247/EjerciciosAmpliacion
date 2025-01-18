public class radaresDeTramo {
    public static void main(String[] args) {

        System.out.println(esMulta(9165,110,300)); //false
        System.out.println(esMulta(9165,110,299)); //true
        System.out.println(esMulta(12000,100,433)); //false
        System.out.println(esMulta(12000,100,431)); //true

    }

    public static boolean esMulta(int distancia,int velocidadMaxima,int tiempo){

        float km = (float)distancia / 1000;
        float horas = (float)tiempo/3600;

        return km/horas>velocidadMaxima;
    }
}
