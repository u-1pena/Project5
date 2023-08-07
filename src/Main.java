public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("tom");
        Cat cat2 = new Cat("tama");
        Cat cat3 = new Cat("mike");

        System.out.println("Hello!" + cat1.getName() + "!");
        System.out.println("Hello!" + cat2.getName() + "!");
        System.out.println("Hello!" + cat3.getName() + "!");
    }
}
