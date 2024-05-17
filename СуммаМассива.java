public class СуммаМассива {
    public static void main(String[] args) {
        int [] massiv = {1,2,3,4,5,6,7,8,9};
        System.out.println(metod(massiv));

    }
    public static int metod (int [] massiv){
        int a = massiv.length;
        int sum = 0;
        for (int i = 0; i < a; i++){
            sum+=massiv[i];
        }return sum;
    }
}
