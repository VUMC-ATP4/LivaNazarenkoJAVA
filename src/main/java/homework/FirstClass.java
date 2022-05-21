package homework;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("This is homework");

        System.out.println();

        String valstsNosaukums = "Sanmarīno";
        System.out.println("Valsts nosaukums: "+ valstsNosaukums);

        int iedzivotajuSkaits = 33930;
        System.out.println("Iedzīvotāju skaits: "+ iedzivotajuSkaits);

        double platiba = 61.2;
        System.out.println("Platība: "+ platiba + "km2");

        String valstsGalvaspilseta = "Sanmarīno";
        System.out.println("Galvaspilsēta: "+ valstsGalvaspilseta);

        String oficialaValoda = "itāļu";
        System.out.println("Valsts valoda: "+ oficialaValoda);

        boolean eiropasSavienibasDalibvalsts = false;
        System.out.println("ES dalībvalsts: "+ eiropasSavienibasDalibvalsts);

        char valstsValuda = '€';

        System.out.println();
        System.out.println("Concatenation");

        System.out.println(valstsNosaukums + " ir pundurvalsts un tās galvaspilsēta saucas tā pat- " + valstsGalvaspilseta + ".");
        System.out.println(valstsNosaukums + " iedzīvotāju skaits 2020.gadā bija " + iedzivotajuSkaits + ".");
        System.out.println(valstsNosaukums + " nav ES dalībvalsts, bet tās valūta ir " + valstsValuda + ".");
        System.out.println("Oficiālā valsts valoda ir " + oficialaValoda + ".");

        System.out.println();

        System.out.println("Aritmētiskās darbības");
        System.out.println("a=2, b=12, c=15");
        System.out.println();
        System.out.println("Saskaitīšana");

        int a = 2;
        int b = 12;
        int c = 15;

        int summa1= a+b;
        int summa2= a+c;
        int summa3= b+c;

        System.out.println("a + b = " + summa1);
        System.out.println("a + c = " + summa2);
        System.out.println("b + c = " + summa3);

        System.out.println();
        System.out.println("Atņemšana");

        int starpiba1= c-b;
        int starpiba2= c-a;
        int starpiba3= b-a;


        System.out.println("c - b = " + starpiba1);
        System.out.println("c - a = " + starpiba2);
        System.out.println("b - a = " + starpiba3);

        System.out.println();
        System.out.println("Reizināšana");

        int reizinajums1= a*b;
        int reizinajums2= a*c;
        int reizinajums3= b*c;

        System.out.println("a * b = "+ reizinajums1);
        System.out.println("a * c = "+ reizinajums2);
        System.out.println("b * c = "+ reizinajums3);

        System.out.println();
        System.out.println("Dalīšana");

        int dalijums1= b/a;
        int dalijums2= c/a;
        int dalijums3= c/b;

        System.out.println("b / a = "+ dalijums1);
        System.out.println("c / a = "+ dalijums2);
        System.out.println("c / b = "+ dalijums3);

        System.out.println();
        System.out.println("Atlikums");

        int atlikums1= b%a;
        int atlikums2= c%a;
        int atlikums3= c%b;

        System.out.println("b % a = "+ atlikums1);
        System.out.println("c % a = "+ atlikums2);
        System.out.println("c % b = "+ atlikums3);


















    }
}
