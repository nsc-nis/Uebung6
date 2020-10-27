package Main;

import javafx.scene.control.ProgressIndicator;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * @author Niklas Schachl
 * @version 1.0, 26.10.2020
 */
public class StatusIndicatorSchachl extends GaugeBase
{
    private int value = 0;

    public StatusIndicatorSchachl()
    {

    }

    @Override
    public void redraw()
    {
        ProgressIndicator progressIndicator = new ProgressIndicator(this.value);

        Text t = new Text();
        t.setText(String.valueOf(this.value));
        t.setFont(Font.font ("Verdana", 20));
        t.setFill(Color.BLACK);

        progressIndicator.setProgress(this.value);
        this.getChildren().addAll(progressIndicator, t);
    }
}
