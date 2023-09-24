import java.util.*;

public class Category {
    private String name;
    public ArrayList<Item> arr;

    public Category(String name, ArrayList<Item> arr) {
        this.name = name;
        this.arr = arr;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category() {

    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getArr() {
        return arr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArr(ArrayList<Item> arr) {
        this.arr = arr;
    }

    public Item removeItem(int index) {
        Item temp = this.arr.get(index);
        this.arr.remove(index);
        return temp;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + this.name + '\'' +
                ", arr=" + this.arr +
                '}';
    }


}
