public class llenandoPiscinas {
    public static void main(String[] args) {
        System.out.println(quienGana(10, 5, 1, 15, 6, 1));
    }

    public static int cuantoTarda(int lPis,int lBar,int lPer){
        int lTotal = lBar;
        int tiempo =0;
        while(lTotal < lPis){
            tiempo++;
            lTotal = lTotal + lBar;
            lTotal = lTotal - lPer;
            if(lTotal <0){
                tiempo = Integer.MAX_VALUE;
                break;
            }
        }
        return tiempo;
    }
    public static int quienGana(int a,int b,int c,int d,int e ,int f){
        if(cuantoTarda(a,b,c) == cuantoTarda(d,e,f)){

            return 0;
        }else if (cuantoTarda(a,b,c) < cuantoTarda(d,e,f)){
            return 1;
        }else {
            return -1;
        }
    }
}