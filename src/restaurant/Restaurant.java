package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("sandwiches", "burger", "it's just a hamburger", 9.50);
        MenuItem item2 = new MenuItem("appetizer", "wings", "buffalo-style chicken wings", 11.00);
        MenuItem item3 = new MenuItem("salad", "caesar salad", "house made dressing, croutons, romaine", 7.00);
        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        System.out.println(menu + "\n********^WHOLE_MENU^***************\n");
        System.out.println(item1.toString() + "\n********^Item 1^***************\n");

        menu.removeItem(item2);

        System.out.println(menu + "\n********^Whole menu w/ Item 2 removed^***************\n");
    }
}
