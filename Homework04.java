/**
 * Created by Peter.Barron on 04/07/2016.
 */
public class Homework04 {
    public static void main(String[] args) {
        boolean itCanFly;

        Bird[] birds = new Bird[4];
        birds[0] = new Chicken();
        birds[1] = new Eagle();
        birds[2] = new Penguin();
        birds[3] = new Swallow();

        for (int i = 0; i < birds.length; i++) {
            itCanFly = birds[i].fly();

            System.out.println(birds[i] + " can fly = " + itCanFly);
        };
    }
}
