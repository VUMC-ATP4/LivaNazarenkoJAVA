package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

        System.out.println("Loģiskās metodes");
        System.out.println();


        System.out.println("Is X positive?");
        int x = 5;
        boolean isPositive= false;

        if (x>0){
            isPositive = true;
            System.out.println(isPositive);
        } else {
            isPositive= false;
            System.out.println(isPositive);
        }
// VAI
        System.out.println("Is X positive?");
        if (x>0){
            System.out.println("true ");
        } else if (x<0) {
            System.out.println("false");
        } else {
            System.out.println(x + "is 0");
        }
// VAI
       Scanner scanner= new Scanner(System.in);
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

        boolean isNegative= true;

        if (x<0){
            isNegative= true;
            System.out.println(isNegative);
        } else {
            isNegative= false;
            System.out.println(isNegative);
        }
        //VAI
        System.out.println("Is y negative?");

        if (x<0){
            System.out.println("true");
        } else if (x>0) {
            System.out.println("false");
        } else{
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

        if (x>5 && x<=10){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println();

        System.out.println("Is x not <=5 and >10?");

        if (!(x<=5 || x > 10)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        System.out.println();

        System.out.println("Is X=0 or x=10?");
        if(x==0 || x==10){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.println();

        System.out.println("Is sum x*x>10?");
        if (x*x>10){
            System.out.println("true");
        }else {
            System.out.println(false);
        }




    }




}
