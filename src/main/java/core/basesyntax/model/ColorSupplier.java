package core.basesyntax.model;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private final Color[] colors = Color.values();
    private final Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].getColor();
    }
}