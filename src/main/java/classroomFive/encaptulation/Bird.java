package classroomFive.encaptulation;

public class Bird {

    public String name; // šis mainigais name būs pieejams no jebkuras vietas programmā

    public void printText() {// var piekļūt arī no citām klasēm
        System.out.println("Printējam putnu");
        System.out.println("Šī ir publiska metode");
    }

    private void printTextSpecial() {// šitādu klasi nevarēs izsaukt nevienā citā klasē, jo tā ir privāta
        System.out.println("Šī ir privāta metode");
    }

    void defaultMethodExamle() {// varam piekļūt pakotnes ietvaros
        System.out.println("Šī ir default metode");
    }
}// video 1:50:37