public class Coffee extends HotDrinks {

    private BeanSpecies species;
    private Type type;

    public Coffee(String name, int volume, int price,BeanSpecies species, Type type) {
        super(name, volume, price);
        this.type = type;
        this.species = species;
    }

    public BeanSpecies getSpecies() {
        return species;
    }

    public Type getType() {
        return type;
    }

    public final void phrases(String greetings){
        System.out.println(greetings);
    }

    public void phrases(String welcoming, String phrase){
            System.out.println(welcoming + "\n" + phrase);
    }

    public String printOrder(){
        return super.printOrder() + "\nBeans - " + species + ", Type - " + type.getCountry() + ", " +
                type.getRoast() + " roast";
    }
}
