public class Main {

    public static void main(String[] args) {

        Coffee espresso = new Coffee("Espresso", 20, 5, BeanSpecies.ROBUSTA,
                new Type("Colombia", "dark"));
        espresso.phrases("Good morning!");
        espresso.phrases("Welcome to Starbucks!", "May I take your order?");
        System.out.println(espresso.printOrder());
        System.out.println("_______________________________");

        Latte latte1 = new Latte("Latte", 150, 8, BeanSpecies.ARABICA,
                new Type("Kenya", "light"),"caramel", "low fat");
        latte1.phrases("Good afternoon!");
        latte1.phrases("Welcome to Starbucks!", "May I take your order?");
        System.out.println(latte1.printOrder());
        latte1.phrases("How would you like to settle your bill?", "Thank you for choosing us!",
                "Have a great afternoon!");
        System.out.println("_______________________________");

        Latte latte2 = new Latte("Latte", 200, 10, BeanSpecies.ARABICA,
                new Type("Ethiopia", "medium"),"chocolate", "almond");
        latte2.phrases("Good evening!");
        latte2.phrases("Welcome to Starbucks!", "May I take your order?");
        System.out.println(latte2.printOrder());
        latte2.phrases("How would you like to settle your bill?", "Thank you for choosing us!",
                "Have a wonderful evening!");
        System.out.println("_______________________________");
    }
}
