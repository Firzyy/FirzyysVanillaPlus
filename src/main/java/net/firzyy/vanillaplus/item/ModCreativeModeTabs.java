package net.firzyy.vanillaplus.item;

import net.firzyy.vanillaplus.VanillaPlus;
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
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
