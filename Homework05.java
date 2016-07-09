import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Peter.Barron
 * @version 1.0
 *
 * Creates an list of objects of type Bird.
 * Loops the array and outputs the Name of each bird
 */
public class Homework05 {
    public static void main(String[] args) {

        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Chicken());
        birds.add(new Eagle());
        birds.add(new Penguin());
        birds.add(new Swallow());
        printBirds(birds);
    }

    /**
     *
     * @param birds list of objects of type Bird
     */
    public static void printBirds (ArrayList<?> birds) {

        for (Object value: birds) {

            System.out.println(value.getClass().getName());
        };
    }
}
