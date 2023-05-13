import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
//PARAMETERS
private double cellwidth;
private double cellHeight;
private double speed;
private double probability;
@FXML
private Pane pane;

//METHODS
@Override
public void initialize(URL location, ResourceBundle resources) {
    System.out.println("Initializing");
    int n = 30; //Number of cells in a row
    int m = 30; //Number of cells in a column
    cellwidth = (double) 1000 / n;
    cellHeight = (double) 500 / m;
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            Cell cell = new Cell(i * cellwidth, j * cellHeight, cellwidth, cellHeight);
            pane.getChildren().add(cell);
            System.out.println("Added a cell at " + i * cellwidth + ", " + j * cellHeight);
        }
    }
    System.out.println("Initialized");
}


}
