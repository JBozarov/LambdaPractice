
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


       // basic lambda otherwise we would have something like sayHello() class below
        ALambdaInterface helloVar = (() -> System.out.println("Basic lambda function "));
        helloVar.someMethod();

        // lambda for sum
        SumInterface sumVar = ( ( a, b) -> a+b );
        System.out.println(sumVar.sum(9, 4));

        DivideInterface divide = ( (a, b) -> a/b);
        System.out.println(divide.divideIntMeth(92, 2));

        // created multiply lambda function and assigned its value to an interface called multiply
        // and then invoked lambda function by calling multiply.multiplyer
        MultiplyInterface multiply = ( (m, n) -> m*n );
        double res = multiply.multiplyer(34, 23);
        System.out.println(res);

        // nonZeroDivide create it in lambda
        // we can use same interface as long as number of params match, then we can create the body here:
        MultiplyInterface nonZero = ( (x, y) -> {
            if (y == 0 ) {
                return 0;
            }
            return x/y;
        });
        System.out.println(nonZero.multiplyer(80, 10));

    }

    public static void walker(Walkable entity) {
        entity.walk();
    }

    public void sayHello() {
        System.out.println("Basic lambda function ");
    }

    public int sum(int a, int b) {
        return a+b;
    }

    public int nonZeroDivide(int x, int y) {
         if ( y == 0 ) {
             return 0;
         }
         return x/y;
    }




}
