import java.util.Random;
public class RandomGenerator {
    private Random random;

    RandomGenerator() {
        random = new Random();
    }

    public double nextInt(int i) {
        return random.nextInt(i);
    }

    public double nextDouble(){
        return random.nextDouble();
    }
}
