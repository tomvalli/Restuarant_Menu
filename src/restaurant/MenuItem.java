package restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String category;
    private String name;
    private String desc;
    private double price;
    private boolean isNew;

    public MenuItem(String category, String name, String desc, double price) {
        this.category = category;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.isNew = true;
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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(category, menuItem.category) &&
                Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }
}
