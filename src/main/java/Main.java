public class Main {
    public static void main(String[] args) {
        System.out.println("x");
        //EN: Integer- LV: vesels skaitlis
        int x = 5;
        int y = 10;

        System.out.println("X ir vienāds ar: ");
        System.out.println(x);
        System.out.println("Y ir vienāds ar: ");
        System.out.println(y);
        System.out.println("X+Y= :");
        System.out.println(x+y);

        //[Mainīgā tips] [Mainīga nosaukums] = [Vērtība]
        //Vārdi un teikumi JAVA valodā tiek saglabāti mainīgā tipā Spring

        String sunaVards = "Reksis";

        // Veseli skaitli mainīga tips ir int
        int sunaVecums = 10;

        //Daļskaitļiem mainīgais tips ir double
        double sunaSvars = 15.5;

        String skirneSunim = "Retrīvers";

        //Jā nē jautājums tiek definēts ar mainīgā tipu boolean
        boolean vaiMansSunsIrIzsalcis = true;

        //vienu simbolu definē ar mainīgā tipu char
        char dzimums = 'M';
        char currency = '€';
        int sunaCena = 100;


        System.out.println("Suņa vārds: "+ sunaVards);
        System.out.println("Suņa vecums: "+ sunaVecums);
        System.out.println("Suņa svars: "+ sunaSvars);
        System.out.println("Suņa šķirne: "+ skirneSunim);
        System.out.println("Vai suns ir izsalcis?: "+ vaiMansSunsIrIzsalcis);
        System.out.println("Suņa dzimums ir "+ dzimums);
        System.out.println("Suņa kucēni maksā :"+ sunaCena + currency);

        int summa;
        int pirmaisSkaitlis = 10;
        int otraisSkaitlis = -8;

        summa = pirmaisSkaitlis + otraisSkaitlis;
        System.out.println(pirmaisSkaitlis +"+"+ otraisSkaitlis +"="+ summa);

        int starpiba = pirmaisSkaitlis - otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = pirmaisSkaitlis % otraisSkaitlis;

        System.out.println("starpiba " + starpiba);
        System.out.println("summa "+ summa);
        System.out.println("dalījums "+ dalijums);
        System.out.println("reizinajums "+ reizinajums);
        System.out.println("atlikums " + atlikums);




    }
}
