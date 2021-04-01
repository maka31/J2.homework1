public class HotDrinks {

    private String name;
    private int volume;
    private int price;

    public HotDrinks(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }

    public String printOrder(){
        return "Order: " + name + ", " + "Volume - " + volume + "ml, " + "Price - " + price + "$";
    }
}
