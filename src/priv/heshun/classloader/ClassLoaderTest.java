package priv.heshun.classloader;

/**
 * 类加载器测试类
 * @author heshun
 * @create 2020-11-18-15:51
 **/
public class ClassLoaderTest {

    public static void main(String[] args) {

        // 获取应用类加载器(系统类加载器)
        // 输出sun.misc.Launcher$AppClassLoader@18b4aac2
        ClassLoader appClassLoader  = ClassLoader.getSystemClassLoader();
        System.out.println(appClassLoader);

        // 获取其上层：扩展类加载器
        // 输出sun.misc.Launcher$ExtClassLoader@4554617c
        ClassLoader extClassLoader = appClassLoader.getParent();
        System.out.println(extClassLoader);

        // 尝试获取其上层：启动类加载器
        // 无法获取，输出null
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);

        // 用户自定义类的类加载器
        // 输出sun.misc.Launcher$AppClassLoader@18b4aac2，即默认使用应用类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        // String类的类加载器
        // 输出null，即String类是使用启动类加载器进行加载的 --> Java的核心类库都是使用启动类加载器进行加载的
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);

    }

}
