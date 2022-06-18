package classroomFive.statika;

public class Car {
    private String name;
    private String color;
    public static String klasesApraksts; // statiskais lauks strādā visiem objektiem ar vienu vērtību
    public static int countOfCarsCreatedInSystem;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        countOfCarsCreatedInSystem++;// katru reizi, kad tiks izveidota jauna mašīna, mūsu statiskajam mainīgajam pieskaitīsies viens klāt
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //var taisīt arī statiskas metodes
    public static void makeSound(){
        System.out.println("brrrr");
    }

}
