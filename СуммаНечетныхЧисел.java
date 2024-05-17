import java.util.Scanner;
public class СуммаНечетныхЧисел {    //на самом деле "вернуть отдельно сумму четных и нечетных чисел"
    public static void main(String[] args) {
        int [] massiv = {1,2,3,4,5,6,7,8,9};
int [] sum = summaChetAndNechet(massiv);
        System.out.println("Сумма четных чисел массива: "+sum[0]);
        System.out.println("Сумма нечетных чисел массива: "+sum[1]);
    }
    public static int [] summaChetAndNechet(int [] massiv){
        int chet = 0;
        int neChet=0;

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0) {
                chet += massiv[i];
            } else {
                neChet += massiv[i];
            }
        }return new int[] {chet, neChet};
    }
}