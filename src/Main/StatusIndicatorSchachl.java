package Main;

import javafx.scene.control.ProgressBar;
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
    private int value;

    public StatusIndicatorSchachl()
    {

    }

    @Override
    public void redraw()
    {
        double progressValue = (double)value;
        System.out.println(progressValue);
        double progress = progressValue / 100;

        ProgressIndicator progressIndicator = new ProgressIndicator(0.0);
        progressIndicator.setPrefSize(50000, 50000);
        progressIndicator.setProgress(progress);
        System.out.println(progress);

        this.getChildren().addAll(progressIndicator);
    }

    @Override
    public void setValue(int v)
    {
        this.value = v;
        this.redraw();
    }
}
