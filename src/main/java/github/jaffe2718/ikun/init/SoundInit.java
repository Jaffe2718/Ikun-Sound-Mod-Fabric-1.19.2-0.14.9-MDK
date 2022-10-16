package github.jaffe2718.ikun.init;

import github.jaffe2718.ikun.IkunMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundInit {

    public static final SoundEvent CHICKEN_DIE = genSoundEvent("chicken_die");
    public static final SoundEvent CHICKEN_HURT = genSoundEvent("chicken_hurt");
    public static final SoundEvent EAT_CHICKEN = genSoundEvent("eat_chicken");
    public static final SoundEvent VILLAGER_DIE = genSoundEvent("villager_die");
    public static final SoundEvent VILLAGER_HURT = genSoundEvent("villager_hurt");

    private static SoundEvent genSoundEvent(String file){
        return new SoundEvent(new Identifier(IkunMod.MOD_ID, file));
    }

    private static void reg(String id, SoundEvent sound) {
        Registry.register(Registry.SOUND_EVENT, new Identifier(IkunMod.MOD_ID, id.toLowerCase()), sound);
    }

    public static void register() {
        reg("chicken_die", CHICKEN_DIE);
        reg("chicken_hurt", CHICKEN_HURT);
        reg("eat_chicken", EAT_CHICKEN);
        reg("villager_die", VILLAGER_DIE);
        reg("villager_hurt", VILLAGER_HURT);
        IkunMod.LOGGER.info("github.jaffe2718.ikun.init.SoundInit: SoundEvents have been already loaded successfully!");
    }
}
