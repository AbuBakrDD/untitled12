import java.util.Scanner;
    class Ryytt {
        public static void main(String[] args) {
            Scanner sc= new Scanner (System.in);
            int a = Integer.parseInt(sc.next());
            String b = sc.next();
            int c = Integer.parseInt(sc.next());
            int result = 0;
            if (a < 1 || a > 10 || c < 1 || c > 10) {
                System.out.println("Ты втираешь мне какую-то дичь!");
            }


            switch (b) {

                case "+":
                    result = a + c;
                    break;
                case "-":
                    result = a - c;
                    break;
                case "*":
                    result = a * c;
                    break;
                case "/":
                    result = a / c;
                    break;
                default:
                    System.out.println("Ты втираешь мне какую-то дичь!");



            }
            System.out.println(result);



        }


}
