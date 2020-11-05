package Main;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
    /*
    StatusIndicatorRiedl riedl = new StatusIndicatorRiedl();
    StatusIndicatorSchachl schachl = new StatusIndicatorSchachl();
    Steiner steiner = new Steiner();

     */

    TextField txtValue = new TextField();

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        VBox box_main = new VBox();
        box_main.setPadding(new Insets(10, 50, 50, 50));
        box_main.setSpacing(20);
        ObservableList list_main = box_main.getChildren();

        HBox box_grid = new HBox();
        box_grid.setPadding(new Insets(10, 50, 50, 50));
        box_grid.setSpacing(20);
        ObservableList list_grid = box_grid.getChildren();

        Button btnValue = new Button();
        btnValue.setText("New Value");
        btnValue.setOnAction(event ->
        {
            try {
                StatusIndicatorRiedl riedl = new StatusIndicatorRiedl();
                StatusIndicatorSchachl schachl = new StatusIndicatorSchachl();
                Steiner steiner = new Steiner();

                box_grid.getChildren().clear();
                
                int v = Integer.parseInt(txtValue.getText());
                riedl.setValue(v);
                schachl.setValue(v);
                steiner.setValue(v);

                list_grid.addAll(schachl, steiner, riedl);
                txtValue.clear();
            }
            catch(Exception ex) {
                System.out.println("Input Exception!");
            }
        });

        /*
        Button button_clear = new Button();
        button_clear.setText("Clear");
        button_clear.setOnAction(event ->
        {
            riedl.setValue(0);
            schachl.setValue(0);
            steiner.setValue(0);
            list_grid.removeAll(riedl, schachl, steiner);
        });

         */

        list_main.add(box_grid);
        list_main.add(txtValue);
        list_main.add(btnValue);
        //list_main.add(button_clear);

        //Creating a Scene
        Scene scene = new Scene(box_main, 700, 500);

        //Setting title to the scene
        stage.setTitle("Gauge Collection");
        //Adding the scene to the stage
        stage.setScene(scene);

        //Displaying the contents of a scene
        stage.show();
    }
}