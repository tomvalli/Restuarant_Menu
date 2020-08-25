package restaurant;

import java.util.Date;

public class MenuItem {
    private String category;
    private String name;
    private String desc;
    private double price;
    private Date date = new Date();

    public MenuItem(String category, String name, String desc, double price, Date date) {
        this.category = category;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
