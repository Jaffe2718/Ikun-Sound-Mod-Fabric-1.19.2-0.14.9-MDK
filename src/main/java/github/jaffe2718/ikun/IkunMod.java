package github.jaffe2718.ikun;

import github.jaffe2718.ikun.init.SoundInit;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IkunMod implements ModInitializer {
	public static final String MOD_ID = "ikun";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		SoundInit.register();
		LOGGER.info("Hello developer Jaffe2718!");
	}

}
