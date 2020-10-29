package Main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
    StatusIndicatorSchachl statusIndicatorSchachl = new StatusIndicatorSchachl();
    TextField txtValue = new TextField();

    public static void main(String[] args) {
        // Launch the JavaFX application
        Application.launch(args);
    }

    @Override public void start(Stage stage) {

        //gb.init(500, 500);

        Button btnValue = new Button();
        btnValue.setText("New Value");
        btnValue.setOnAction(event ->
        {
            try
            {
                int v = Integer.parseInt(txtValue.getText());
                statusIndicatorSchachl.setValue(v);
                statusIndicatorSchachl.redraw();
            }
            catch(Exception ex)
            {
                System.out.println("Input Exception!");
            }
        }
        );

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10, 50, 50, 50));
        vBox.setSpacing(20);
        vBox.getChildren().addAll(statusIndicatorSchachl, txtValue, btnValue);

        //Creating a Scene
        Scene scene = new Scene(vBox);

        //Setting title to the scene
        stage.setTitle("Gauge Collection");
        //Adding the scene to the stage
        stage.setScene(scene);

        //Displaying the contents of a scene
        stage.show();
    }
}