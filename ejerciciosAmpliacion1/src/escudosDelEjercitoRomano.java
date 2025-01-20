public class escudosDelEjercitoRomano {
    public static void main(String[] args) {


        System.out.println(cuantosEscudos(35));//71
        System.out.println(cuantosEscudos(20));//44
        System.out.println(cuantosEscudos(10));//26

    }

    public static int cuantosEscudos(int soldados){

        int numero=1;
        int grupo=0;
        int quadrado=0;
        int multi=0;

        int totalEscudos=0;
        int escudos=0;

        while(soldados>0) {

            while (true) {
                quadrado = numero * numero;
                if (soldados - quadrado >= 0){
                    grupo = quadrado;
                    multi=numero;
                }
                if(quadrado>soldados){
                    break;
                }
                numero++;
            }
            soldados= soldados-grupo;

//            System.out.println(grupo);
//
//            System.out.println(multi+" x "+multi);

            if(grupo == 1){
                escudos= 5;
            }else{
                escudos=(grupo+ 8) + (multi-2) *4 ;
            }

            totalEscudos= totalEscudos+escudos;

            numero =1;
        }
        //System.out.println("grupo 1  " +grupo);

        return totalEscudos;
    }
}
