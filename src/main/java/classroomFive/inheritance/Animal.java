package classroomFive.inheritance;

public class Animal {
    int legCount;
    String name;

    // var uztaisīt konstruktoru (var taisīt arī ar labo taustiņu)

    Animal(int legCount, String name){
        this.legCount = legCount;
        this.name = name;

    }

    //var uztaisīt metodi, ko mantos citas klases un būs vienojošas
    public void printLegCount(){
        System.out.println("Vārds: " + name + ", kāju skaits ir " + legCount);
    }

    public void makeSound(){
        System.out.println("Es esmu dzīvnieks. Rrrrrrrr...");
    }

}
