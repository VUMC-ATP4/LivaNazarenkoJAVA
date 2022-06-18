package classroomFive.inheritance;

import classroomFive.inheritance.Animal;

public class Dog extends Animal {

    // extends Animal nozīmē, ka šajā klasē parādīsies viss, kas nodefinēts klasē Animal. Saucas mantošana

    // Ja Animal klasē ir konstruktors, tad viņš jāuztaisa arī klasēs, kuras manto info no tās
    public Dog(int legCount, String name) {
        super(legCount, name); // super paņem konstruktoru no bāzes klases (šajā gadījumā no Animal
    }

    public void makeSound(){
        System.out.println("Es esmu suns, vau vau vau");
    }
}
