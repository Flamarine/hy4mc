package io.github.pkstdev.hy4mc.mixin;

import io.github.pkstdev.hy4mc.HyLoggerSLF4JWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = {LoggerFactory.class}, remap = false)
public class LoggerFactoryMixin {
    @Inject(method = "getLogger(Ljava/lang/String;)Lorg/slf4j/Logger;", at = @At("HEAD"), cancellable = true)
    private static void getLogger(String name, CallbackInfoReturnable<Logger> cir) {
        cir.setReturnValue(new HyLoggerSLF4JWrapper(name));
    }

    @Inject(method = "getLogger(Ljava/lang/Class;)Lorg/slf4j/Logger;", at = @At("HEAD"), cancellable = true)
    private static void getLogger(Class<?> clazz, CallbackInfoReturnable<Logger> cir) {
        cir.setReturnValue(new HyLoggerSLF4JWrapper(clazz.toString()));
    }
}
