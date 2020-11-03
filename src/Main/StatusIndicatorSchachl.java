package Main;

import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.TickLabelOrientation;
import eu.hansolo.medusa.skins.BarSkin;
import eu.hansolo.medusa.skins.ModernSkin;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.paint.Color;

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
        Gauge gauge = new Gauge();

        gauge.setValue(0);
        gauge.setUnitColor(Color.WHITE);
        gauge.setValueColor(Color.WHITE);
        gauge.setDecimals(0);
        gauge.setValue(value);
        gauge.setAnimated(true);
        gauge.setAutoScale(true);
        gauge.setPrefSize(200,200);

        gauge.setBarColor(Color.rgb(0, 214, 215));
        gauge.clearAreas();

        gauge.setSkin(new BarSkin(gauge));

        this.getChildren().addAll(gauge);
    }

    @Override
    public void setValue(int v)
    {
        this.value = v;
        this.redraw();
    }
}
