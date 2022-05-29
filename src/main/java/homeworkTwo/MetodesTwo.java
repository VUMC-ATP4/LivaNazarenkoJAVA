public class MetodesTwo {

    public static void main(String[] args) {
        printBusinessCard();
        System.out.println();
        printBusinessCard();
        System.out.println();
        printBusinessCard();
        
        System.out.println();
        System.out.println();

        printBusinessCardTwo("Lūcijs", "Podiņš", "85858585", "1950");
        System.out.println();
        printBusinessCardTwo("Arīna", "Nazarenko", "-", "2020");
        System.out.println();
        System.out.println();

        int summa = sum (4, 6);
        System.out.println(summa);

        System.out.println();
        System.out.println();

        double average= average(5, 8, 6);
        System.out.println(average);


    }
    static void printBusinessCard(){
        System.out.println("Name: Liva");
        System.out.println("Surname: Nazarenko");
        System.out.println("Phone number: 12345678");
        System.out.println("Date of birth: 1987");
    }
    static void printBusinessCardTwo(String name, String surname, String phoneNumber, String dateOfBirth){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Date of birth: " + dateOfBirth);
    }

    static int sum (int a, int b){
        return a+b;
    }

    static double average(double c, double d, double e){
        return (c+d+e)/3;
    }

}
