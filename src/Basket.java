import java.util.ArrayList;
import java.util.Set;

public class Basket {




    public ArrayList<Item> arr;



    public Basket(ArrayList<Item> arr) {
        this.arr = arr;
    }



    public Basket() {
        this.arr = new ArrayList<Item>();
    }

    public ArrayList<Item> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Item> arr) {
        this.arr = arr;
    }

    public void AddItem(Item item){
        this.arr.add(item);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "arr=" + arr +
                '}';
    }
}
