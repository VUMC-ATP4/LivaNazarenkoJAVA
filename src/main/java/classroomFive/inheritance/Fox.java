package classroomFive.inheritance;

import classroomFive.inheritance.Animal;

public class Fox extends Animal {
    String name;
    int legCount;

    public Fox(String name, int legCount) {
        super (legCount, name);
    }
public void printLegCount(){
    System.out.println("Vārds: " + name + ", kāju skaits: " + legCount + ".");
}
}
