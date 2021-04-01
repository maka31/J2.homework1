public final class Latte extends Coffee {

    private String flavour;
    private String milk;

    public Latte(String name, int volume, int price, BeanSpecies species, Type type, String flavour, String milk) {
        super(name, volume, price, species, type);
        this.flavour = flavour;
        this.milk = milk;
    }

    public String getFlavour(){
        return flavour;
    }

    public String getMilk() {
        return milk;
    }

    public void phrases(String phrase1, String phrase2, String farewell){
            System.out.println(phrase1 + "\n" + phrase2 + "\n" + farewell);
    }

    public String printOrder(){
        return super.printOrder() + "\nFlavour - " + flavour + ", Milk - " + milk;
    }
}
