import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();
        System.out.println();
        System.out.println("Output:");
        System.out.println(calc(input));
    }

    public static String calc(String input) throws Exception {
        int num1;
        int num2;
        String oper;
        String result;
        boolean isRoman;
        String[] str = input.split(" ");

        if (str.length != 3) throw new Exception("Должно быть два операнда");

        oper = str[1];

        if (oper == null) throw new Exception("Неподдерживаемая математическая операция");
        if (Roman.isRoman(str[0]) && Roman.isRoman(str[2])) {
            num1 = Roman.convertToArabian(str[0]);
            num2 = Roman.convertToArabian(str[2]);
            isRoman = true;
        }
        else if (!Roman.isRoman(str[0]) && !Roman.isRoman(str[2])) {
            num1 = Integer.parseInt(str[0]);
            num2 = Integer.parseInt(str[2]);
            isRoman = false;
        }
        else {
            throw new Exception("Числа должны быть в одном формате");
        }
        if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1) throw new Exception("Числа должны быть от 1 до 10");
        int arabian = calc(num1, num2, oper);
        if (isRoman) {
            if (arabian < 1) {
                throw new Exception("Римское число должно быть больше нуля");
            }
            result = Roman.convertToRoman(arabian);
        } else {
            result = String.valueOf(arabian);
        }
        return result;
    }
    static int calc(int a, int b, String oper) {

        if (oper.equals("+")) return a + b;
        else if (oper.equals("-")) return a - b;
        else if (oper.equals("*")) return a * b;
        else return a / b;
    }
}

class Roman {
    static String[] romanArray = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
            "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
            "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
            "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
            "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
            "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
            "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
            "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
            "XCVIII", "XCIX", "C"};


    public static boolean isRoman(String val) {
        for (int i = 0; i < romanArray.length; i++) {
            if (val.equals(romanArray[i])) {
                return true;
            }
        }
        return false;
    }

    public static int convertToArabian(String roman) {
        for (int i = 0; i < romanArray.length; i++) {
            if (roman.equals(romanArray[i])) {
                return i;
            }
        }
        return -1;
    }

    public static String convertToRoman(int arabian) {
        return romanArray[arabian];
    }

}