package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        // write your code here
        MenuItem spaghetti = new MenuItem("spaghetti", 7.10, "noodles and stuff on it", "main", false);
        MenuItem soup = new MenuItem("soup", 13.23, "hot broth n stuff", "appetizer", true);
        ArrayList<MenuItem> myMenu = new ArrayList<>();
        myMenu.add(spaghetti);
        myMenu.add(soup);
        Menu newMenu = new Menu(myMenu, new Date(2021, 2, 13));
        System.out.println(newMenu.getMenu());
        //this is a new line of code
    }

    @Override
    public String toString() {
        return "Restaurant{}";
    }
}