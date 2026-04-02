package com.infrastructuresickos.jens_pams_harvestcraft;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("jens_pams_harvestcraft")
public class JensPamsHarvestcraft {
    public static final Logger LOGGER = LogManager.getLogger();

    public JensPamsHarvestcraft() {
        LOGGER.info("JensPamsHarvestcraft mod initialized");
    }
}
