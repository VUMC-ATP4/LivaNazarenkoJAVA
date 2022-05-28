package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

        System.out.println("Loģiskās metodes");
        System.out.println();


        System.out.println("Is X positive?");
        int x = 5;
        boolean isPositive = false;

        if (x > 0) {
            isPositive = true;
            System.out.println(isPositive);
        } else {
            isPositive = false;
            System.out.println(isPositive);
        }
// VAI
        System.out.println("Is X positive?");
        if (x > 0) {
            System.out.println("true ");
        } else if (x < 0) {
            System.out.println("false");
        } else {
            System.out.println(x + "is 0");
        }
// VAI
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter X!");
//       int X;
//        X =scanner.nextInt();
//        boolean isItPositive = false;
//
//        if (X > 0){
//            isItPositive =true;
//            System.out.println(isItPositive);
//        } else if (X <0) {
//            isItPositive =false;
//            System.out.println(isItPositive);
//        }
        System.out.println();

        System.out.println("Is x negative?");

        boolean isNegative = true;

        if (x < 0) {
            isNegative = true;
            System.out.println(isNegative);
        } else {
            isNegative = false;
            System.out.println(isNegative);
        }
        //VAI
        System.out.println("Is y negative?");

        if (x < 0) {
            System.out.println("true");
        } else if (x > 0) {
            System.out.println("false");
        } else {
            System.out.println(x + "is 0");
        }
        //VAI
//        System.out.println("Enter Y!");
//        int Y;
//        Y= scanner.nextInt();
//        boolean isItNegative= true;
//
//        if (Y<0){
//            isItNegative= true;
//            System.out.println(isItNegative);
//        } else {
//            isItNegative= false;
//            System.out.println(isItNegative);
//        }
        System.out.println();

        System.out.println("Is x>5 and <=10?");

        if (x > 5 && x <= 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println();

        System.out.println("Is x not <=5 and >10?");

        if (!(x <= 5 || x > 10)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println();

        System.out.println("Is X=0 or x=10?");
        if (x == 0 || x == 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println();

        System.out.println("Is sum x*x>10?");
        if (x * x > 10) {
            System.out.println("true");
        } else {
            System.out.println(false);
        }
        System.out.println();
        System.out.println();

        System.out.println("Otrais uzdevums");
        System.out.println("Enter a number from 1 to 12");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Month" + month + "not defined");
        }
        System.out.println();
        System.out.println();
        System.out.println("Trešais uzdevums");

        System.out.println("Ievadi trīs veselus skaitļus!");
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("Lielākais skaitlis ir " + a);
        } else if (b > a && b > c) {
            System.out.println("Liekākais skaitlis ir " + b);
        } else {
            System.out.println("Liekākais skaitlis ir " + c);
        }
        System.out.println();
        System.out.println();

        System.out.println("Ceturtais uzdevums");

        String color = "red";
        System.out.println("Enter a color!");
        color = scanner.next();

        if (color.equals("red")) {
            System.out.println("Stop! You have to wait!");
        } else if (color.equals("yellow")) {
            System.out.println("Be ready to move!");
        } else if (color.equals("green")) {
            System.out.println("You can move while there is green color");
        } else {
            System.out.println("The color is not defined");
        }
    }
}











