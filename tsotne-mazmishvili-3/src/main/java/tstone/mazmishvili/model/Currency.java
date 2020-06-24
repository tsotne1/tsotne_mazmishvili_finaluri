package tstone.mazmishvili.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Currency {
    private String name;
    private String description;
    private double currency;
    private Date date;



    public Currency() {
    }

    public Currency(String name, String description, double currency, Date date) {
        this.name = name;
        this.description = description;
        this.currency = currency;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
