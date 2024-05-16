
                    //Вернуть число встречающихся символов в слове

import java.util.Scanner;
public class Sobes {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String simv = scan.next();
    char c = simv.charAt(0);
        System.out.println(chislo(str, c));
    }

    public static int chislo(String str, char c){
        int a = 0;
        for (int b = 0; b < str.length(); b++) {
            char x = str.charAt(b);
            if (x == c) {
                a++;
            }
        }
        return a;
    }
}