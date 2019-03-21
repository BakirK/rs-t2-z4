import java.util.Scanner;

public class Main {

    public static int broj_Najvecih(double[] niz, double broj) {
        int brojac = 0;
        for(int i=0; i < niz.length; i++) {
            if (niz[i] > broj) {
                brojac = brojac + 1;
            }
        }
        return brojac;
    }

    public static void main(String[] args) {
        double[] numbers = new double[100];
        Scanner ulaz = new Scanner(System.in);
        double n;
        while(true) {
            System.out.println("Unesite broj elemenata niza: ");
            n = ulaz.nextDouble();
            if (n<1 || n > 100) {
                System.out.println("Pogresan interval: ");
                continue;
            } else {
                break;
            }
        }

        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = ulaz.nextDouble();
        }


    }
}
