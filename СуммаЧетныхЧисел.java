import java.util.Scanner;
public class СуммаЧетныхЧисел {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //int [] a = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(srz(str));
    }
    public static int srz (String str){
        int sum = 0;
        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);

            if (c%2==0 && c<58 && c>47){
                int d = Character.getNumericValue(c);
                sum +=d;
            }

        }return sum;
    }
}
