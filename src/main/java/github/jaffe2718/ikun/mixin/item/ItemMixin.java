package github.jaffe2718.ikun.mixin.item;

import github.jaffe2718.ikun.init.SoundInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Item.class)
public class ItemMixin {

    @Inject(method="usageTick", at=@At("HEAD"))
    private void setEatingChickenSound(World world, LivingEntity user, ItemStack stack, int remainingUseTicks, CallbackInfo ci) {
        Item item = stack.getItem();
        if (user instanceof PlayerEntity player &&
                item.isFood() &&
                (item.equals(Items.CHICKEN) || item.equals(Items.COOKED_CHICKEN)) &&
                (remainingUseTicks == stack.getMaxUseTime()-4)) {
            player.playSound(SoundInit.EAT_CHICKEN, 1.0F, 1.0F);
        }
    }
}
