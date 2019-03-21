import java.util.*;

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
            System.out.print("Unesite broj elemenata niza: ");
            n = ulaz.nextDouble();
            if (n<1 || n > 100) {
                System.out.print("Pogresan interval: ");
                continue;
            } else {
                break;
            }
        }

        System.out.print("Unesite elemente niza: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = ulaz.nextDouble();
        }
        DoubleSummaryStatistics test = Arrays.stream(numbers).summaryStatistics();
        double max = test.getMax();
        System.out.println("Broj elemenata koji su veci od korjena najveceg elementa je: " + broj_Najvecih(numbers, Math.sqrt(max)));


        /*
        double max = Arrays.stream(numbers).min().getAsDouble();
        System.out.println(max);
        System.out.println(broj_Najvecih(numbers, Math.sqrt(max)));

        List lista = Arrays.asList(numbers);
        System.out.println(Collections.max(lista));*/


    }
}