import java.util.Arrays;

public class MaxZnachMass {
    public static void main(String[] args) {
        int [] mas = {1,2,3,4,5,6,7,8,9};
        System.out.println(Max(mas));
    }
    public static int Max (int [] mas){
        int max = Arrays.stream(mas).max().getAsInt();
        return max;
    }
}
