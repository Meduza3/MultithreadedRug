import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    //PARAMETERS
    private double cellwidth;
    private double cellHeight;
    private static double speed = 1000.0;
    private static double probability = 0.2;
    @FXML
    private Pane pane;

    public RandomGenerator rng = new RandomGenerator();

    //METHODS
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initializing");
        int n = 100; //Number of cells in a row
        int m = 50; //Number of cells in a column
        cellwidth = (double) 1000 / n;
        cellHeight = (double) 500 / m;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Cell cell = new Cell(i * cellwidth, j * cellHeight, cellwidth, cellHeight);
                Thread thread = new Thread(cell);
                Color col = new Color(rng.nextDouble(), rng.nextDouble(), rng.nextDouble(), 1);
                cell.setFill(col);
                cell.setStroke(col);
                pane.getChildren().add(cell);
                thread.start();
                System.out.println("Added a cell at " + i * cellwidth + ", " + j * cellHeight);
            }
        }
        System.out.println("Initialized");

    }

    public static double getProbability() {
        return probability;
    }
    static public double getSpeed(){
        return speed;
    }
}
