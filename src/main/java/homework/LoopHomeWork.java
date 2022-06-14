package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        //1.uzd- no lietotāja nolasa veselus skaitļus un apstājas, izvadot uz ekrānu tekstu:  “Gatavs”, kad šo vērtību summa pārsniedz 100

        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (sum < 100) {
            System.out.println("Enter number: ");
            sum += input.nextInt();// ka// s ir ar sum +=?
        }
        System.out.println("Ready! The sum is " + sum);
        System.out.println();

        //2.uzd- nolasa veselu skaitli un izvada uz ekrāna, vai šis skaitlis ir pirmskaitlis vai nē.

        int b;
        boolean prime = true;

        System.out.println("Enter any number:");
        //capture the input in an integer
        int num = input.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            b = num % i;
            if (b == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println(num + " is prime number");
        else
            System.out.println(num + " is not prime number");
        System.out.println();

        //3.uzdevums- 1.	Definēt trīs masīvus ar datu tipiem: int, String, char un jāizvada uz ekrāna visas vērtības
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] fruits = {"Apple", "Peach", "Pear", "Banana", "Grape"};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("a");// while
        System.out.println("**********");

        int numb = 0;
        while (numb < numbers.length) {
            System.out.println(numbers[numb]);
            numb++;
        }
        System.out.println();
        int augli = 0;
        while (augli < fruits.length) {
            System.out.println(fruits[augli]);
            augli++;
        }
        System.out.println();
        int letter = 0;
        while (letter < vowels.length) {
            System.out.println(vowels[letter]);
            letter++;
        }
        System.out.println();
        System.out.println("b");// do while
        System.out.println("**********");

        int numb1 = 0;
        do {
            System.out.println(numbers[numb1]);
            numb1++;
        }
        while (numb1 < numbers.length);

        System.out.println();

        int augli1 = 0;
        do {
            System.out.println(fruits[augli1]);
            augli1++;
        }
        while (augli1 < fruits.length);

        System.out.println();

        int letter1 = 0;
        do {
            System.out.println(vowels[letter1]);
            letter1++;
        }
        while (letter1 < vowels.length);
        System.out.println();

        System.out.println("c");//for
        System.out.println("**********");

        for (numb = 0; numb < numbers.length; numb++) {
            System.out.println(numbers[numb]);
        }
        System.out.println();

        for (augli = 0; augli < fruits.length; augli++) {
            System.out.println(fruits[augli]);
        }
        System.out.println();
        for (letter = 0; letter < vowels.length; letter++) {
            System.out.println(vowels[letter]);
        }
        System.out.println();
        System.out.println("d");//each
        System.out.println("**********");

        for (int numb2 : numbers) {
            System.out.println(numb2);
        }
        System.out.println();

        for (String augli2 : fruits) {
            System.out.println(augli2);
        }
        System.out.println();

        for (char letter2 : vowels) {
            System.out.println(letter2);
        }
        System.out.println();

// 4. uzdevums - Definēt veselu skaitļu masīvu ar izmēru 100, un ar ciklu aizpildīt šo masīvu ar pāra skaitļiem. Visas vērtības, kas ir iekšā masīva, ir nepieciešams izvest uz ekrāna vienā līnijā.

        int c = 0;
        int[] paraSkaitli = new int[100];
        for (c = 0; c < paraSkaitli.length; c++) {
            paraSkaitli[c] = c * 2;
        }
        for (c = 0; c < paraSkaitli.length; c++) { //kādēļ šeit vēlreiz jāinicializē c, ja iepriekšējā ciklā tas jau ir izdarīts?
            System.out.print(paraSkaitli[c] + " ");
        }
        System.out.println();
        System.out.println();
        //5.uzdevums- Uzrakstiet Java programmu, lai aprēķinātu dotā skaitļa faktoriālo vērtību
        int factorial = 1;
        System.out.println("Enter the number: !");
        int number = input.nextInt();
        for (int d = 1; d <= number; d++) {
            factorial = factorial * d;
        }
        System.out.println("Factorial " + number + " is " + factorial);

        System.out.println();
        System.out.println();

        //6. uzdevums- Izstrādāt kodu tā, lai lietotājam būtu tikai trīs mēģinājumi uzminēt pareizo konta PIN kodu. Jāizveido int konstanti, kur tiks saglabāts PIN (public final int  VARIABLE_NAME). Ja parole ir ievadīta pareizi, jāizvada uz ekrāna: “PIN ir pieņemts, laipni lūdzam atpakaļ”. Ja parole nav pareiza, jāizvada uz ekrāna:  “Nepareizs PIN, mēģiniet vēlreiz.”. Kad mēģinājumi beigušies, uz ekrāna jāizvada:  “Atvainojiet, bet jūs esat bloķēts”.

        final int password = 1547;
        System.out.print("Please enter PIN code: ");
        int pin = input.nextInt();

        if (password == pin) {
            System.out.print("Correct PIN. Welcome back!");

        } else {
            System.out.println("Incorrect PIN, Try again!");

            for (int d = 0; d < 2; d++) {
                System.out.print("Please enter PIN code: ");
                pin = input.nextInt();
                if (password == pin) {
                    System.out.print("Correct PIN. Welcome back!");
                    break;

                } else {
                    System.out.println("Incorrect PIN, Try again!");
                }
                    for (d = 0; d < 1; d++) {
                        System.out.print("Please enter PIN code: ");
                        pin = input.nextInt();
                        if (password == pin) {
                            System.out.print("Correct PIN. Welcome back!");
                        }
                        if (password != pin)
                            System.out.print("Sorry, account is blocked!");
                    }
                }// šajā uzdevumā if else sadaļu var uztaisīt kā metodi?
            }

        }
    }














