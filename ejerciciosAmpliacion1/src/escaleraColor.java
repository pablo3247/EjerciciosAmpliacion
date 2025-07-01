public class escaleraColor {

    public static void main(String[] args) {
        System.out.println(sacarEscalera(4, 2, 3, 1));     // espera 5

    }

    public static  int sacarEscalera(int a,int b,int c,int d){
        int carta=0;
        int resta1 = Math.abs(a-b);
        int resta2 = Math.abs(b-c);
        int resta3 = Math.abs(c-d);
        if(resta1>2 ||resta2>2 ||resta3 >2){
            return 0;
        }

        for (int i = 0; i <= 14; i++) {
            if(i !=  a&& i != b&& i != c&& i != d) {
                if(d == 14) {
                    if (i < a) {
                        carta = i;
                    } else if (i < b) {
                        carta = i;
                    } else if (i < c) {
                        carta = i;
                    } else if (i < d) {
                        carta = i;
                    }
                }else {

                    if (i > a) {
                        carta = i;
                        break;
                    } else if (i > b) {
                        carta = i;
                        break;
                    } else if (i > c) {
                        carta = i;
                        break;
                    } else if (i > d) {
                        carta = i;
                        break;
                    }
                }
            }
        }
            return carta;
    }}