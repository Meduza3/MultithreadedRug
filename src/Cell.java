import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Cell extends Rectangle implements Runnable {
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;
    public RandomGenerator rng = new RandomGenerator();
    public Cell(double x, double y, double width, double height) {
        super(x, y, width, height);

        setStroke(javafx.scene.paint.Color.BLACK);
        setFill(javafx.scene.paint.Color.WHITE);

        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Start: " + Thread.currentThread().getName());
            if( rng.nextDouble() < Controller.getProbability()){
                Color col = new Color(rng.nextDouble(), rng.nextDouble(), rng.nextDouble(), 1);
                setFill(col);
                //setStroke(col);
            }
            try {
                Thread.sleep((long) (rng.nextInt(Controller.getSpeed()) + Controller.getSpeed()/2));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End: " + Thread.currentThread().getName());
        }
    }
}
