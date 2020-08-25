package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private Date date = new Date();

    public Menu(ArrayList<MenuItem> menu, Date date) {
        this.menu = menu;
        this.date = date;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
