package me.libraryaddict.disguise.utilities.scheduler;

import com.tcoded.folialib.wrapper.task.WrappedTask;
import me.libraryaddict.disguise.LibsDisguises;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

public final class Schedulers {
    private Schedulers() {}

    public static void runSync(Runnable r) {
        LibsDisguises.getFoliaLib().getScheduler().runNextTick(t -> r.run());
    }

    public static WrappedTask runSyncLater(Runnable r, long ticks) {
        return LibsDisguises.getFoliaLib().getScheduler().runLater(r, ticks);
    }

    public static WrappedTask runSyncTimer(Runnable r, long delay, long period) {
        return LibsDisguises.getFoliaLib().getScheduler().runTimer(r, delay, period);
    }

    public static void runAsync(Runnable r) {
        LibsDisguises.getFoliaLib().getScheduler().runAsync(t -> r.run());
    }

    public static WrappedTask runAsyncLater(Runnable r, long ticks) {
        return LibsDisguises.getFoliaLib().getScheduler().runLaterAsync(r, ticks);
    }

    public static WrappedTask runAsyncTimer(Runnable r, long delay, long period) {
        return LibsDisguises.getFoliaLib().getScheduler().runTimerAsync(r, delay, period);
    }

    public static void runAtEntity(Entity e, Runnable r) {
        LibsDisguises.getFoliaLib().getScheduler().runAtEntity(e, t -> r.run());
    }

    public static WrappedTask runAtEntityLater(Entity e, Runnable r, long ticks) {
        return LibsDisguises.getFoliaLib().getScheduler().runAtEntityLater(e, r, ticks);
    }

    public static WrappedTask runAtEntityTimer(Entity e, Runnable r, long delay, long period) {
        return LibsDisguises.getFoliaLib().getScheduler().runAtEntityTimer(e, r, delay, period);
    }

    public static void runAtLocation(Location l, Runnable r) {
        LibsDisguises.getFoliaLib().getScheduler().runAtLocation(l, t -> r.run());
    }

    public static void cancel(WrappedTask task) {
        if (task != null) {
            task.cancel();
        }
    }
}
