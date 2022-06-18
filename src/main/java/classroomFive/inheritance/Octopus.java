package classroomFive.inheritance;

import classroomFive.inheritance.Animal;

public class Octopus extends Animal {

    // Ja Animal klasē ir konstruktors, tad viņš jāuztaisa arī klasēs, kuras manto info no tās
     String waterType = "Sālsūdens";
    public Octopus(int legCount, String name) {
        super(legCount, name); // super paņem konstruktoru no bāzes klases (šajā gadījumā no Animal)
    }

    @Override
    public void makeSound() {
        super.makeSound();// super nozime, ka nemam originālo metodi no Animal
    }
}
