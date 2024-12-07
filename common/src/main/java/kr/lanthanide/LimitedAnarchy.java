package kr.lanthanide;

import dev.ftb.mods.ftblibrary.snbt.SNBTCompoundTag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LimitedAnarchy {
    public static final String MOD_ID = "limitedanarchy";
    public static final String MOD_NAME = "Limited Anarchy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        LOGGER.info("Initializing! ");
        LOGGER.info(new SNBTCompoundTag().toString());
    }
}
