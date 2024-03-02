package net.firzyy.vanillaplus.item;

import net.firzyy.vanillaplus.VanillaPlus;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VanillaPlus.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new SwordItem(ModToolTiers.EMERALD, 4, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new PickaxeItem(ModToolTiers.EMERALD, 2, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new AxeItem(ModToolTiers.EMERALD, 6, -3, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
            new ShovelItem(ModToolTiers.EMERALD, 2, -3, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
            new HoeItem(ModToolTiers.EMERALD, -2, -1, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
