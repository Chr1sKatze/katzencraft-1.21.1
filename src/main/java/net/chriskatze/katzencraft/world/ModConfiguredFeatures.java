package net.chriskatze.katzencraft.world;

import net.chriskatze.katzencraft.KatzencraftMod;
import net.chriskatze.katzencraft.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> ADAMANTIUM_ORE_KEY = registerKey("adamantium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ADAMANTIUM_ORE_NETHER_KEY = registerKey("adamantium_ore_nether");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ADAMANTIUM_ORE_END_KEY = registerKey("adamantium_ore_end");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MYTHRIL_ORE_KEY = registerKey("mythril_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MYTHRIL_ORE_NETHER_KEY = registerKey("mythril_ore_nether");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MYTHRIL_ORE_END_KEY = registerKey("mythril_ore_end");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MANDERVILLIUM_ORE_KEY = registerKey("mandervillium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MANDERVILLIUM_ORE_NETHER_KEY = registerKey("mandervillium_ore_nether");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MANDERVILLIUM_ORE_END_KEY = registerKey("mandervillium_ore_end");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_NETHER_KEY = registerKey("platinum_ore_nether");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_END_KEY = registerKey("platinum_ore_end");

    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_NETHER_KEY = registerKey("silver_ore_nether");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_END_KEY = registerKey("silver_ore_end");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldAdamantiumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ADAMANTIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ADAMANTIUM_ORE_DEEPSLATE.getDefaultState()));
        List<OreFeatureConfig.Target> netherAdamantiumOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.ADAMANTIUM_ORE_NETHER.getDefaultState()));
        List<OreFeatureConfig.Target> endAdamantiumOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.ADAMANTIUM_ORE_END.getDefaultState()));

        List<OreFeatureConfig.Target> overworldMythrilOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MYTHRIL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.MYTHRIL_ORE_DEEPSLATE.getDefaultState()));
        List<OreFeatureConfig.Target> netherMythrilOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.MYTHRIL_ORE_NETHER.getDefaultState()));
        List<OreFeatureConfig.Target> endmythrilOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.MYTHRIL_ORE_END.getDefaultState()));

        List<OreFeatureConfig.Target> overworldMandervilliumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MANDERVILLIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.MANDERVILLIUM_ORE_DEEPSLATE.getDefaultState()));
        List<OreFeatureConfig.Target> netherMandervilliumOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.MANDERVILLIUM_ORE_NETHER.getDefaultState()));
        List<OreFeatureConfig.Target> endMandervilliumOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.MANDERVILLIUM_ORE_END.getDefaultState()));

        List<OreFeatureConfig.Target> overworldPlatinumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.PLATINUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.PLATINUM_ORE_DEEPSLATE.getDefaultState()));
        List<OreFeatureConfig.Target> netherPlatinumOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.PLATINUM_ORE_NETHER.getDefaultState()));
        List<OreFeatureConfig.Target> endPLatinumOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.PLATINUM_ORE_END.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSilverOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SILVER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.SILVER_ORE_DEEPSLATE.getDefaultState()));
        List<OreFeatureConfig.Target> netherSilverOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.SILVER_ORE_NETHER.getDefaultState()));
        List<OreFeatureConfig.Target> endSilverOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.SILVER_ORE_END.getDefaultState()));

        register(context, ADAMANTIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAdamantiumOres,12));
        register(context, ADAMANTIUM_ORE_NETHER_KEY, Feature.ORE, new OreFeatureConfig(netherAdamantiumOres,10));
        register(context, ADAMANTIUM_ORE_END_KEY, Feature.ORE, new OreFeatureConfig(endAdamantiumOres,8));

        register(context, MYTHRIL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMythrilOres,12));
        register(context, MYTHRIL_ORE_NETHER_KEY, Feature.ORE, new OreFeatureConfig(netherMythrilOres,10));
        register(context, MYTHRIL_ORE_END_KEY, Feature.ORE, new OreFeatureConfig(endmythrilOres,8));

        register(context, MANDERVILLIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMandervilliumOres,12));
        register(context, MANDERVILLIUM_ORE_NETHER_KEY, Feature.ORE, new OreFeatureConfig(netherMandervilliumOres,10));
        register(context, MANDERVILLIUM_ORE_END_KEY, Feature.ORE, new OreFeatureConfig(endMandervilliumOres,8));

        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPlatinumOres,12));
        register(context, PLATINUM_ORE_NETHER_KEY, Feature.ORE, new OreFeatureConfig(netherPlatinumOres,10));
        register(context, PLATINUM_ORE_END_KEY, Feature.ORE, new OreFeatureConfig(endPLatinumOres,8));

        register(context, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSilverOres,12));
        register(context, SILVER_ORE_NETHER_KEY, Feature.ORE, new OreFeatureConfig(netherSilverOres,10));
        register(context, SILVER_ORE_END_KEY, Feature.ORE, new OreFeatureConfig(endSilverOres,8));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(KatzencraftMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}