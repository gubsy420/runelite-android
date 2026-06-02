import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qb")
public class qb implements ThreadFactory {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/ThreadGroup;"
	)
	ThreadGroup ak_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bv_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	qv this$0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/atomic/AtomicInteger;"
	)
	AtomicInteger ag_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread az(Runnable var1) {
		Thread var2 = new Thread(this.ak_fld, var1, this.this$0.ak_fld + "-rest-request-" + this.ag_fld.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread av(Runnable var1) {
		Thread var2 = new Thread(this.ak_fld, var1, this.this$0.ak_fld + "-rest-request-" + this.ag_fld.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread ak(Runnable var1) {
		Thread var2 = new Thread(this.ak_fld, var1, this.this$0.ak_fld + "-rest-request-" + this.ag_fld.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread ag(Runnable var1) {
		Thread var2 = new Thread(this.ak_fld, var1, this.this$0.ak_fld + "-rest-request-" + this.ag_fld.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("newThread")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	@Override
	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.ak_fld, var1, this.this$0.ak_fld + "-rest-request-" + this.ag_fld.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	qb(qv var1) {
		this.this$0 = var1;
		this.ag_fld = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.ak_fld = null != var2 ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread ae(Runnable var1) {
		Thread var2 = new Thread(this.ak_fld, var1, this.this$0.ak_fld + "-rest-request-" + this.ag_fld.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}
}
