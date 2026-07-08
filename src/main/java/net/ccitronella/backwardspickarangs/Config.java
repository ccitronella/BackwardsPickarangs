package net.ccitronella.backwardspickarangs;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.DoubleValue SPEED_FACTOR = BUILDER
            .comment("Value to multiply the Pickarang's speed by.")
            .defineInRange("speedFactor", -1.0, -20.0, 20.0);

    static final ModConfigSpec SPEC = BUILDER.build();

}
