package chapter6;

public class PhoneBill {
    private double charge = 0.25;
    private int tax = 15;
    private int ID;
    private double base_cost;
    private int allotted_minutes;
    private int used_minutes;

    public PhoneBill(int ID) {
        this.ID = ID;
    }

    public PhoneBill(int ID,
                     double plan,
                     int allotted_minutes,
                     int used_minutes) {
        this.ID = ID;
        this.base_cost = plan;
        this.allotted_minutes = allotted_minutes;
        this.used_minutes = used_minutes;
    }

    public double calcOverage() {
        return used_minutes * charge;
    }

    public double calcTaxes() {
        return base_cost * tax * 0.01;
    }

    public double calcTotal(double overage,
                            double taxes,
                            double plan_fee) {
        return overage + taxes + plan_fee;
    }
}
