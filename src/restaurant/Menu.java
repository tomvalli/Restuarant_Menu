package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    private ArrayList<MenuItem> menu;
    private Date date;
    public static String lastUpdated;

    public Menu() {
        this.menu = new ArrayList<MenuItem>();
        this.date = new Date();
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

    public void removeItem(MenuItem item) {
        menu.removeIf(items -> items.equals(item));
    }

    public void addItem(MenuItem item) {
//        for(MenuItem items : menu) {
//            if(items.equals(item)) {
//                Scanner in = new Scanner(System.in);
//                System.out.println("Are you sure you want add duplicate items? (Enter YES or NO)");
//                String response = in.nextLine();
//            }
//        }
        lastUpdated = date.toString();
        this.menu.add(item);
    }

    @Override
    public String toString() {
        String wholeMenu = "";
        for(MenuItem items : menu) {
            wholeMenu += items.toString() + "\n";
        }
        wholeMenu += lastUpdated;
        return wholeMenu;
    }
}
