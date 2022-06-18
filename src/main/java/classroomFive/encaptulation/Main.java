package classroomFive.encaptulation;

public class Main {
    public static void main(String[] args) {

        Bird putns = new Bird();
        putns.printText();

        putns.name = "Koko";// paņēma mainīgo name, kurš bija nodefinēts klasē Bird

        Human cilveks = new Human();//te nevar paņemt neko no Human nodefinētā, jo viss private.
        //lai dabūtu ārā info var uztaisīt konstruktoru vai arī (skat klasi Human)

        cilveks.setAge(2);
        System.out.println(cilveks.getAge());

        cilveks.setAge(20);// paņēmām publisko metodi no Human klases
        System.out.println(cilveks.getAge());

        cilveks.setName("Līva");
        System.out.println(cilveks.getName());

        cilveks.setSurname("Nazarenko");
        System.out.println(cilveks.getSurname());

        cilveks.setHeight(169);
        System.out.println(cilveks.getHeight());

        Matematika matematika = new Matematika();
        System.out.println(matematika.add(30, 20));
        System.out.println(matematika.add(1.2, 3.5));

        matematika.paraditTekstu("Līva");
        matematika.paraditTekstu("Līva", false);
       matematika.paraditTekstu("Jānis", true);

    }
}
