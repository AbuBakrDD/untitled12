public class VivestiSlovo {
    public static void main(String[] args) {
        String str = "Hello 5";
        slovo(str);
    }
    public static void slovo (String str){
        String [] s = str.split(" ");
        for (int i = 0; i < s.length; i++){

        }
        int a = Integer.parseInt(s[1]);
        for (int j = 0; j < a; j++){
            System.out.println(s[0]);
        }
    }
}
