package github.jaffe2718.ikun.mixin.entity;


import github.jaffe2718.ikun.init.SoundInit;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.sound.SoundEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VillagerEntity.class)
public class VillagerMixin {
    @Inject(at=@At("RETURN"), method="getHurtSound", cancellable=true)
    private void setHurtSound(CallbackInfoReturnable<SoundEvent> cir) {
        cir.setReturnValue(SoundInit.VILLAGER_HURT);
    }

    @Inject(at=@At("RETURN"), method="getDeathSound", cancellable=true)
    private void setDeathSound(CallbackInfoReturnable<SoundEvent> cir) {
        cir.setReturnValue(SoundInit.VILLAGER_DIE);
    }
}
