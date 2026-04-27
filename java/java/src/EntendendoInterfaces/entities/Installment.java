package EntendendoInterfaces.entities;

import java.util.Date;

public class Installment {
    private Date duoDate;
    private Double amount;

    public Installment(){}

    public Installment(Date duoDate, Double amount) {
        super();
        this.duoDate = duoDate;
        this.amount = amount;
    }
}
