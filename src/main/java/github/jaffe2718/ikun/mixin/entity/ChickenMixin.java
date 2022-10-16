package github.jaffe2718.ikun.mixin.entity;

import github.jaffe2718.ikun.init.SoundInit;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.sound.SoundEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChickenEntity.class)
public class ChickenMixin {

    @Inject(method="getDeathSound", at=@At("RETURN"), cancellable=true)
    private void setDeathSound(CallbackInfoReturnable<SoundEvent> cir) {
        cir.setReturnValue(SoundInit.CHICKEN_DIE);
    }

    @Inject(method="getHurtSound", at=@At("RETURN"), cancellable=true)
    private void setHurtSound(DamageSource source, CallbackInfoReturnable<SoundEvent> cir) {
        cir.setReturnValue(SoundInit.CHICKEN_HURT);
    }
}
