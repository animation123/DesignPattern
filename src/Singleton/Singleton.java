package Singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    // 这里是其他的有用实例化变量
    private Singleton() { }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // 这里是其他的有用方法
}
