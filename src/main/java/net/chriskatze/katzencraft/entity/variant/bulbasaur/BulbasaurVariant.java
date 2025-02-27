package net.chriskatze.katzencraft.entity.variant.bulbasaur;

import java.util.Arrays;
import java.util.Comparator;

public enum BulbasaurVariant {
    MALE_NORMAL(0),
    FEMALE_NORMAL(1),
    MALE_SHINY(2),
    FEMALE_SHINY(3);

    private static final BulbasaurVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(
            BulbasaurVariant::getId)).toArray(BulbasaurVariant[]::new);
    private final int id;

    BulbasaurVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return  this.id;
    }

    public static BulbasaurVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}