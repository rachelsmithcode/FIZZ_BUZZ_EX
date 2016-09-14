package assignments.fizz_buzz_ex;

/**
 * Created by RachelSmith on 14/09/2016.
 */
public class FizzBuzz {

    public void enterNumber(int i) {
        if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i == 5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}
