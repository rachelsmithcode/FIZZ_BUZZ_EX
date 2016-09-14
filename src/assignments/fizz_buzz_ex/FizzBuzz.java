package assignments.fizz_buzz_ex;

/**
 * Created by RachelSmith on 14/09/2016.
 */
public class FizzBuzz {

    public void enterNumber(int i) {
        if (checkMultiple(i, 3)) {
            System.out.println("Fizz");
        } else if (checkMultiple(i, 5)) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }

    private boolean checkMultiple(int i, int n) {
        return i % n == 0;
    }
}
