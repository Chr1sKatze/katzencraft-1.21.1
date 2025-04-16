package net.chriskatze.katzencraft.item;

import net.chriskatze.katzencraft.KatzencraftMod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // ORES ------------------------------------------------------------------------------------------------------------
    public static final Item ADAMANTIUM_RAW = registerItem("adamantium_raw", new Item(new Item.Settings()));
    public static final Item ADAMANTIUM_NUGGET = registerItem("adamantium_nugget", new Item(new Item.Settings()));
    public static final Item ADAMANTIUM_INGOT = registerItem("adamantium_ingot", new Item(new Item.Settings()));

    public static final Item MYTHRIL_RAW = registerItem("mythril_raw", new Item(new Item.Settings()));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget", new Item(new Item.Settings()));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new Item.Settings()));

    public static final Item MANDERVILLIUM_RAW = registerItem("mandervillium_raw", new Item(new Item.Settings()));
    public static final Item MANDERVILLIUM_NUGGET = registerItem("mandervillium_nugget", new Item(new Item.Settings()));
    public static final Item MANDERVILLIUM_INGOT = registerItem("mandervillium_ingot", new Item(new Item.Settings()));

    public static final Item PLATINUM_RAW = registerItem("platinum_raw", new Item(new Item.Settings()));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget", new Item(new Item.Settings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new Item.Settings()));

    public static final Item SILVER_RAW = registerItem("silver_raw", new Item(new Item.Settings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));

    public static final Item STEEL_RAW = registerItem("steel_raw", new Item(new Item.Settings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new Item.Settings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));

    // COMBAT ----------------------------------------------------------------------------------------------------------
    public static final Item STEEL_SHORTSWORD = registerItem("steel_shortsword",
            new SwordItem(ModToolMaterials.STEEL,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL,3,-2.4f))));
    public static final Item STEEL_LONGSWORD = registerItem("steel_longsword",
            new SwordItem(ModToolMaterials.STEEL,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL,3,-2.8f))));

    // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    // USED TO REGISTER  MOD ITEMS -------------------------------------------------------------------------------------
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KatzencraftMod.MOD_ID, name), item);
    }

    // USED FOR INITIALIZATION AND LOGGING OF THE MODITEMS CLASS -------------------------------------------------------
    public static void registerModItems() {
        KatzencraftMod.LOGGER.info("Registering ModItems for " + KatzencraftMod.MOD_ID);
    }
}