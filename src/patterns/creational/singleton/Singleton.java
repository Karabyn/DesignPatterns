package patterns.creational.singleton;

/**
 * Created by petro on 04-Jul-17.
 */
public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // Этот код эмулирует медленную инициализацию.
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            synchronized(Singleton.class) {  // THREAD-SAFE
                if (instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }
}