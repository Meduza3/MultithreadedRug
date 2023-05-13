import java.util.Random;
public class RandomGenerator {
    private Random random;

    RandomGenerator() {
        random = new Random();
    }

    public Object nextInt(int i) {
        return random.nextInt(i);
    }
}
