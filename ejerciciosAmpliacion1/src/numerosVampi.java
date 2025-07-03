public class numerosVampi {
    public static void main(String[] args) {


        System.out.println(detector("1260"));

    }


    public static boolean detector(String num){
        int pro1 = -22;
        int pro2=-22;
        String digit;
        int test;
        boolean señal = true;
        //Chapuzada D:
        int in1 =0;
        int in2 =1;
        int in3 =2;
        int in4 =3;

        for (int i = 0; i < 25; i++) {

            System.out.println("NUMERO 1 "+in1);
            if(in1 <4 &&in2 <4 &&in3 <4 &&in4 <4 ){
                pro1 = Integer.parseInt(num.charAt(in1) + "" + num.charAt(in2));
                System.out.println("NUM1 = "+num.charAt(in1));

                pro2 = Integer.parseInt(num.charAt(in3) + "" + num.charAt(in4));
            }else {
                 in1 =3;
                 in2 =2;
                 in3 =1;
                 in4 =0;
            }
            in1++;
            in2++;
            in3++;
            in4++;
            test = pro1 * pro2;
            System.out.println(pro1 + "   x  " + pro2);

            System.out.println(test);

            for (int e = 0; e < 4; e++) {

                digit = num.charAt(e) + "";

                if (!String.valueOf(test).contains(digit)) {
                    señal = false;
                }
            }
        }

        return señal;
    }

}
