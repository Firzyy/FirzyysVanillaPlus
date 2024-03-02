package net.firzyy.vanillaplus.item;

import net.firzyy.vanillaplus.VanillaPlus;
import net.firzyy.vanillaplus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VanillaPlus.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VANILLAPLUS_TAB = CREATIVE_MODE_TABS.register("vanillaplus_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.vanillaplus_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBY.get());

                        output.accept(ModBlocks.RUBY_BLOCK.get());

                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());

                        output.accept(ModItems.EMERALD_SWORD.get());
                        output.accept(ModItems.EMERALD_PICKAXE.get());
                        output.accept(ModItems.EMERALD_SHOVEL.get());
                        output.accept(ModItems.EMERALD_AXE.get());
                        output.accept(ModItems.EMERALD_HOE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
