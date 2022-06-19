package homework.oop_homework;

import java.util.Date;

public class Visit {

    private String Costumer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String costumer, Date date) {
        Costumer = costumer;
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }


}
