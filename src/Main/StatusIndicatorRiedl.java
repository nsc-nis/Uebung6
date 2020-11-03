package Main;

import javafx.scene.control.ProgressIndicator;

public class StatusIndicatorRiedl extends GaugeBase
{
    private int value;

    public StatusIndicatorRiedl() {
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
