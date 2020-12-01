package priv.heshun.heap;

/**
 * 堆空间大小的查看和设置
 * @author heshun
 * @create 2020-11-30-17:45
 **/
public class HeapSpaceInitial {
    public static void main(String[] args) {

        // Runtime.getRuntime采用的是单例模式
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("-Xms:" + initialMemory + "M");
        System.out.println("-Xmm:" + maxMemory + "M");

        System.out.println("系统内存大小:" + initialMemory * 64.0 / 1024 + "G");
        System.out.println("系统内存大小:" + maxMemory * 4.0 / 1024 + "G");
    }

}
