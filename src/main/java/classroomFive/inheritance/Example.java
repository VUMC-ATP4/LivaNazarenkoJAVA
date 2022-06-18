package classroomFive.inheritance;
// uztaisījam atsevišķu klasi, lai būtu Main, kur palaist visu, kas dzīvnieku klasēs

public class Example {
    public static void main(String[] args) {

        // uztaisījām Main metodē jaunu suni un astoņkāji (ja pārējās klasēs ir uztaisīti konstruktori, tad šitā)
        Dog dog1 = new Dog(4, "Reksis");
        Octopus octupus1 = new Octopus(8, "Patriks");

        // ja klasē (Animal, jo Dog visu manto no tās) ir nodefinēts kāds mainīgais tad var darīt šitā (bez konstruktora)
       // dog1.legCount = 4; //prjam šeit nodefinējām, ka sunim ir 4 kājas
        // octupus1.legCount =

        // ja Animal nodefinēta jauna metode, tad šeit patiešo var ielikt metodi un nevajag to likt Dog un Octopus
        dog1.printLegCount();
        octupus1.printLegCount();

        System.out.println(octupus1.waterType);// var izprintēt tikai to, kas nodefinēts konkrētajā klasē. Piem dog1 nebūs waterType, j tas tur nav deginēts

        Fox lapsa = new Fox("Kūmiņš", 4);

        // ar šo visu var taisīt arī masīvus
        Animal[] dzivnieki = {dog1, octupus1, lapsa};

        // ar šo izejam cauri masīvam
for (int i = 0; i < dzivnieki.length; i++){
    dzivnieki[i].printLegCount();
}

dog1.makeSound();
octupus1.makeSound();




    }
}
