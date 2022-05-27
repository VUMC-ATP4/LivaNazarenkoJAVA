package clasroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {
    public static void main(String[] args) {
        System.out.println("Otrā Java lekcija");

        System.out.println();
        System.out.println();

   //paskatīties par format un tikt galā ar to

        //te sāksies otrā nodarbība

        //šis ir arī mainīgais, tikai tam ir cits tips, tālāk ir nosaukums un pēc tam deklarācija
        Scanner scanner = new Scanner (System.in);

//        System.out.println("Ievadi savu vārdu!");
//        String vards = scanner.nextLine();
//        System.out.println("Labdien " + vards + "!");
//        System.out.println("Esi sveicināts kalkulatora programmā!");
//
//        System.out.println();
//
//        int a;
//        int b;
//
//        System.out.println("Ievadi skaitli a");
//        a = scanner.nextInt();
//
//        System.out.println("Ievadi skaitli b");
//        b = scanner.nextInt();
//
//        int summa = a+b;
//        System.out.println(String.format("%s + %s = %s", a,b,summa));
//
//        System.out.println();
//
//        //salīdzināšanas izteiksmes, visas ir prezentācijā
//        System.out.println(a>b);
//        System.out.println(a==b);// vai ir vienāds
//        System.out.println(a!=b);// nav vienāds
//
//        //loģiskie operatori, skatīt prezentāciju
//
//        System.out.println("Ievadi x: ");
//        int x=scanner.nextInt();
//        boolean vaiIrPatiess = (x<5 && x<10);
//        System.out.println(vaiIrPatiess);
//
//        System.out.println(x<5 || x<10);
//
//        //if, then

        if(6>3){
            System.out.println("Seši ir lielāks par trīs");
        }

        int vecums;
        System.out.println("Tavs vecums?");
        vecums= scanner.nextInt();

        if(vecums >= 18){
            System.out.println("Drīkst balsot");
        }
        System.out.println("Tālākās darbības");
        System.out.println();

        //if else

        int skaitlis = 5;
        if(skaitlis>0){
        System.out.println(skaitlis + "ir pozitīvs");}
        else{
            System.out.println(skaitlis + "ir negatīvs");
        }
        System.out.println();

        int cipars = 15;

        if(cipars == 10){
            System.out.println("Cipars ir 10");
        }else if (cipars == 15) {
            System.out.println("Cipars ir 15");
        }else if (cipars == 20) {
            System.out.println("Cipars ir 20");
        }else {
            System.out.println( "Nezināms skaitlis");
        }

        System.out.println();

        int month = 2;
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 12:
                System.out.println("December");
            default:
                System.out.println("Mēnesis "+ month + " nav definēts");
        }

        //uzdevums- vai ievadītais skaitlis ir lielāks par 0
        int q=10;
        if(q>0){
            System.out.println("q=true");
        }

        System.out.println();

        //uzdevums- vai var iet pensijā?
        int cilvekaVecums=65;
        char dzimums = 'V';
        boolean drikstDoties = false;

        if(dzimums== 'V' && cilvekaVecums >= 65){
            drikstDoties = true;
        } else if(dzimums == 'S' && cilvekaVecums>=60){
            drikstDoties= true;
        }
        System.out.println("Cilvēks drīkst doties pensijā " + drikstDoties);


    }
}
