package kr.lanthanide.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import kr.lanthanide.LimitedAnarchy;

@Mod(LimitedAnarchy.MOD_ID)
public final class LimitedAnarchyForge {
    public LimitedAnarchyForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(LimitedAnarchy.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        LimitedAnarchy.init();
    }
}
