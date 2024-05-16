public class SredneeArifm {
    public static void main(String[] args) {
        double [] dab = {1,2,3,4,5,6,7,8,9};
        System.out.println(doub(dab));
    }
    public static double doub (double [] dab){
        double d = 0;
        for (int x = 0; x< dab.length; x++){
            d = dab[x]+d;

        }
        double c = d/dab.length;
return c;
    }

}
