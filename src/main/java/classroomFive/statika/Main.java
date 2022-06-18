package classroomFive.statika;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", "black");
        System.out.println("Auto skaits sistēmā: " + car1.countOfCarsCreatedInSystem);
        Car car2 = new Car("Toyota", "red");
        System.out.println("Auto skaits sistēmā: " + car2.countOfCarsCreatedInSystem);

car1.klasesApraksts = "Šī ir auto klase"; // šs ir tas statiskais lauks, kas strādā uz visu klasi

        System.out.println("Car1: "+ car1.getName() + " " + car1.getColor() + car1.klasesApraksts);
        System.out.println("Car2: "+ car2.getName() + " " + car2.getColor() + car2.klasesApraksts);
Car.makeSound();// statiskā metode
    }
}
