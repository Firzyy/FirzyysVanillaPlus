package net.firzyy.vanillaplus.datagen;

import net.firzyy.vanillaplus.VanillaPlus;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = VanillaPlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent gatherDataEvent) {
        DataGenerator dataGenerator = gatherDataEvent.getGenerator();
        PackOutput packOutput = dataGenerator.getPackOutput();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = gatherDataEvent.getLookupProvider();

        dataGenerator.addProvider(gatherDataEvent.includeServer(), new ModRecipeProvider(packOutput));
        dataGenerator.addProvider(gatherDataEvent.includeServer(), ModLootTableProvider.create(packOutput));

        dataGenerator.addProvider(gatherDataEvent.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));

        ModBlockTagGenerator blockTagGenerator = dataGenerator.addProvider(gatherDataEvent.includeServer(),
                new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
    }
}