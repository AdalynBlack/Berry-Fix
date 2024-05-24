package com.frankiebtw.berryfix.mixin;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockItem.class)
public abstract class MixinBlockItem extends Item {
    public MixinBlockItem(Properties properties) {
        super(properties);
    }

    @Inject(at = @At("HEAD"),
            method = "useOn",
            cancellable = true)
    public void useOn$MixinBlockItem(UseOnContext useOnContext, CallbackInfoReturnable<InteractionResult> cir) {
        // Ensure player is not null
        if(useOnContext.getPlayer() == null)
            return;

        // Don't do any checks if the override is held. This should restore vanilla functionality
        if(useOnContext.getPlayer().isCrouching())
            return;

        // If the player is invulnerable (likely from being in creative or spectator mode) restore vanilla behavior
        if(useOnContext.getPlayer().getAbilities().invulnerable)
            return;

        // Check the dedicated "canEat" function to see if the food is edible at the current moment
        if(this.getFoodProperties() == null)
            return;
        if(!useOnContext.getPlayer().canEat(this.getFoodProperties().canAlwaysEat()))
            return;

        // At this point, the player should be able to eat, should need to eat,
        // and shouldn't be in creative mode or spectator mode, so we attempt to eat
        InteractionResult interactionResult = this.use(
                useOnContext.getLevel(),
                useOnContext.getPlayer(),
                useOnContext.getHand()
        ).getResult();

        // To be fully honest, I'm not sure why this is here, but it was in BlockItem$useOn, so I kept it for consistency
        if(interactionResult == InteractionResult.CONSUME)
            interactionResult = InteractionResult.CONSUME_PARTIAL;

        // Forcibly return the new interaction result and skip the default functionality
        cir.setReturnValue(interactionResult);
    }
}
