package homework.oop_homework;
import java.util.Date;




public class Example {

        public static void main(String[] args) {
            System.out.println();

            Customer costumer1 = new Customer("Aija");
            costumer1.setMember(true);
            costumer1.setMemberType("Premium");

            Visit visit = new Visit(costumer1, new Date());
           // System.out.println(visit.toString());

            visit.setProductExpense(5.00);
            visit.setServiceExpense(15.20);
            System.out.println(visit);

            System.out.println("Total expense for " + visit.getName() + " = " + visit.getTotalExpense());

            System.out.println();

            Customer costumer2 = new Customer("Jana");
            costumer2.setMember(true);
            costumer2.setMemberType("Gold");

            Visit visit2 = new Visit(costumer2, new Date());

            visit2.setProductExpense(5.00);
            visit2.setServiceExpense(15.20);
            System.out.println(visit2);
            System.out.println("Total expense for " + visit2.getName() + " = " + visit2.getTotalExpense());

            System.out.println();

            Customer costumer3 = new Customer("Anna");
            costumer3.setMember(true);
            costumer3.setMemberType("Silver");

            Visit visit3 = new Visit(costumer3, new Date());

            visit3.setProductExpense(5.00);
            visit3.setServiceExpense(15.20);
            System.out.println(visit3);
            System.out.println("Total expense for " + visit3.getName() + " = " + visit3.getTotalExpense());

            System.out.println();

            Customer costumer4 = new Customer("Otto");
            costumer4.setMember(false);

            Visit visit4 = new Visit(costumer4, new Date());

            visit4.setProductExpense(5.00);
            visit4.setServiceExpense(15.20);
            System.out.println(visit4);
            System.out.println("Total expense for " + visit4.getName() + " = " + visit4.getTotalExpense());
      }

    }
