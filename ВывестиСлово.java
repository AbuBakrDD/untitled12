public class ВывестиСлово {
    public static void main(String[] args) {
        String text = "Hello world";
        char simvol = 'l';
        slovo(text, simvol);
    }
    public static void slovo (String text, char simvol){
        String [] str = text.split(" ");
        for (int i = 0; i < str.length; i++){
            if (str[i].indexOf(simvol)>0){
                System.out.println(str[i]);
            }else {
                System.out.println(str[i]);
            }
        }

    }
}
