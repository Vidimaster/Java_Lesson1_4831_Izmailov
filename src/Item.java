public class Item {
    private String name;



    private Integer price;
    private float rate;



    public Item(String name, Integer price, float rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public Item() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public float getRate() {
        return rate;
    }



    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rate=" + rate +
                '}';
    }


}
