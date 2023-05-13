import javafx.scene.shape.Rectangle;
public class Cell extends Rectangle implements Runnable {
    private double x;
    private double y;
    private double width;
    private double height;
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
        // TODO Auto-generated method stub
    }
}
