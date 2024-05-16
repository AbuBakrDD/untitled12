                                       //Вернуть слово без цифр

import java.util.Scanner;
public class SlovoBezCifr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String slovo = scan.nextLine();
        System.out.println(string(slovo));
    }
    public static String string (String slovo) {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x<slovo.length(); x++) {
            char simv = slovo.charAt(x);
            if (simv>57 || simv<48){
                sb.append(simv);
            }
        }
            return sb.toString();
    }
}
