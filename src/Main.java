
import java.util.Arrays;
import java.util.*;

import static java.util.Collections.addAll;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[] strAr1 = new String[]{"Intel", "Asus", "Pentium", "MacBook", "iBook", "Irbis", "Window Notebook"};
        String[] strAr2 = new String[]{"Bowl", "Skillet", "Set of silver spoons", "Pan", "Tea pot", "Cup"};
        String[] strAr3 = new String[]{"Screwdriver", "Saw", "Nails", "Multi-tool"};

        ArrayList<Item> arr1 = new ArrayList<Item>();
        ArrayList<Item> arr2 = new ArrayList<Item>();
        ArrayList<Item> arr3 = new ArrayList<Item>();

        ArrayList<Item> arr4 = new ArrayList<Item>();

        ArrayList<Item> empty = new ArrayList<Item>();

        for (int i = 0; i < strAr1.length; i++) {
            arr1.add(new Item( strAr1[i], 20000 + random.nextInt(20000), 0.0F + random.nextInt(5)));
        }
        for (int i = 0; i < strAr2.length; i++) {
            arr2.add(new Item( strAr2[i], 500 + random.nextInt(700), 0.0F + random.nextInt(5)));
        }
        for (int i = 0; i < strAr3.length; i++) {
            arr3.add(new Item( strAr3[i], 150 + random.nextInt(500), 0.0F + random.nextInt(5)));
        }

        arr4.addAll(arr1);
        arr4.addAll(arr2);
        arr4.addAll(arr3);

        Category Category1 = new Category("Notebooks", arr1);
        Category Category2 = new Category("Cooking Utensils", arr2);
        Category Category3 = new Category("Tools", arr3);

        Category Category4 = new Category("All", arr4);

        System.out.println(Category4);

        Basket myBasket1 = new Basket();
        Basket myBasket2 = new Basket();
        Basket myBasket3 = new Basket();

        myBasket1.AddItem(Category4.removeItem(2));
        myBasket1.AddItem(Category4.removeItem(6));
        myBasket1.AddItem(Category4.removeItem(3));

        myBasket2.AddItem(Category4.removeItem(3));
        myBasket2.AddItem(Category4.removeItem(5));
        myBasket2.AddItem(Category4.removeItem(2));

        myBasket3.AddItem(Category4.removeItem(3));
        myBasket3.AddItem(Category4.removeItem(5));
        myBasket3.AddItem(Category4.removeItem(2));
        myBasket3.AddItem(Category4.removeItem(0));
        myBasket3.AddItem(Category4.removeItem(1));
        myBasket3.AddItem(Category4.removeItem(1));
        myBasket3.AddItem(Category4.removeItem(1));
        myBasket3.AddItem(Category4.removeItem(1));


        User user1 = new User("Petya", "334pass", myBasket1);
        User user2 = new User("Vasya", "1222", myBasket2);
        User user3 = new User("NewLogin", "1222", myBasket3);

        System.out.println("user1.getBasket() = " + user1.getBasket());
        System.out.println("user2.getBasket() = " + user2.getBasket());
        System.out.println("user3.getBasket() = " + user3.getBasket());

        System.out.println(Category4.getArr());

    }


}