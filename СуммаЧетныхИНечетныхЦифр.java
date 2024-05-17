public class СуммаЧетныхИНечетныхЦифр {
    public static void main(String[] args) {
        int [] massiv = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        metod(massiv);
    }

    public static void metod(int[] massiv) {
        int chet = 0;
        int neChet = 0;

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0) {
                chet += massiv[i];
            } else if (massiv[i] % 2 != 0) {
               neChet+= massiv[i];

        }
    }System.out.println(chet);
        System.out.println(neChet);
}
}