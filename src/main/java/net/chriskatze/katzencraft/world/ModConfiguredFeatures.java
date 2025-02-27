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

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ADAMANTIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ADAMANTIUM_ORE_DEEPSLATE.getDefaultState()));
        List<OreFeatureConfig.Target> netherOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.ADAMANTIUM_ORE_NETHER.getDefaultState()));
        List<OreFeatureConfig.Target> endOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.ADAMANTIUM_ORE_END.getDefaultState()));

        register(context, ADAMANTIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOres,12));
        register(context, ADAMANTIUM_ORE_NETHER_KEY, Feature.ORE, new OreFeatureConfig(netherOres,10));
        register(context, ADAMANTIUM_ORE_END_KEY, Feature.ORE, new OreFeatureConfig(endOres,8));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(KatzencraftMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}