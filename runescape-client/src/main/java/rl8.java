import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@ObfuscatedName("rl8")
public @interface rl8 {
	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int wt();
}
