package Main;

import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.TickLabelOrientation;
import eu.hansolo.medusa.skins.ModernSkin;
import eu.hansolo.medusa.skins.SimpleDigitalSkin;
import javafx.scene.paint.Color;

public class Steiner extends GaugeBase{
    private int value;

    @Override
    public void redraw()
    {
        Gauge gauge = new Gauge();

        gauge.setSkin(new ModernSkin(gauge));
        gauge.setUnit("Km / h");
        gauge.setUnitColor(Color.WHITE);
        gauge.setDecimals(0);
        gauge.setValue(value);
        gauge.setAnimated(true);

        gauge.setValueColor(Color.WHITE);
        gauge.setTitleColor(Color.WHITE);
        gauge.setSubTitleColor(Color.WHITE);
        gauge.setBarColor(Color.rgb(0, 214, 215));
        gauge.setNeedleColor(Color.RED);
        gauge.setThresholdColor(Color.RED);
        gauge.setThreshold(85);
        gauge.setThresholdVisible(true);
        gauge.setTickLabelColor(Color.rgb(151, 151, 151));
        gauge.setTickMarkColor(Color.WHITE);
        gauge.setTickLabelOrientation(TickLabelOrientation.ORTHOGONAL);

        gauge.setSkin(new SimpleDigitalSkin(gauge));

        this.getChildren().addAll( gauge);
    }

    @Override
    public void setValue(int v)
    {
        this.value = v;
        this.redraw();
    }
}