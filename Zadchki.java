public class Zadchki {
    public static void main(String[] args) {
        for(int x=4; x<=6; x++){
            //System.out.print(x+" ");
        }
    }
    }
class SummaOt1Do100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=100; i++){
            sum+=i;
        }
        System.out.println("Сумма чисел от 1 до 100: "+sum);
    }

}

class Faktorial {

        static int calculateFactorial (int n){
        int result = 1;
        for(int m = 1; m<=n; m++) {
            result = result*m;
        }
        return result;
        }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(9));
    }
    }

