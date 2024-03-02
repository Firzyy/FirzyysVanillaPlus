package net.firzyy.vanillaplus.item;

import net.firzyy.vanillaplus.VanillaPlus;
import net.firzyy.vanillaplus.utilities.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1150, 7, 2, 12,
                    ModTags.Blocks.NEEDS_EMERALD_TOOL, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation(VanillaPlus.MOD_ID, "emerald"), List.of(Tiers.IRON), List.of());
}
