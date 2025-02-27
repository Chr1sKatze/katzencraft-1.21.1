package net.chriskatze.katzencraft.entity.variant.kakuna;

import java.util.Arrays;
import java.util.Comparator;

public enum KakunaVariant {
    NORMAL(0),
    SHINY(1);

    private static final KakunaVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(
            KakunaVariant::getId)).toArray(KakunaVariant[]::new);
    private final int id;

    KakunaVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return  this.id;
    }

    public static KakunaVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
