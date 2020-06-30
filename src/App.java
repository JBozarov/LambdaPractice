
public class App {

    public static void main(String[] args) {
        // Lambda is a block of code used to implement on method defined by functional interface ( has only one abstract function )
        Human tom = new Human();
        walker(tom);

        Robot wale = new Robot();
        wale.walk();

        walker( () -> System.out.println("Custom object walking... "));

       Walkable aBlockOfCode = () -> {
            System.out.println("Customer object walking " );
            System.out.println("HELLOW ");
        };

       walker(aBlockOfCode);
    }

    public static void walker(Walkable entity) {
        entity.walk();
    }
}
