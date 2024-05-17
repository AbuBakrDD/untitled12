import java.util.Arrays;

public class ВернутьМинимальноеЗначениеМассива {
    public static void main(String[] args) {
        int [] massiv = {1,2,3,4,5,6,7,8,9};
        System.out.println(min(massiv));
    }
    public static int min (int [] massiv){
        int m = Arrays.stream(massiv).min().getAsInt();
        return m;
   }
}
