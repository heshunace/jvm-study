package priv.heshun.stack;

/**
 * 测试参数-Xss256k的作用
 * @author heshun
 * @create 2020-11-20-14:33
 **/
public class StackOverflowErrorTest {

    private static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println(count);
        main(args);
    }

    // 测试结果：
    // 正常情况下，count最后输出：11405
    // 设置栈的大小为256k(参数-Xss256k)后，count最后输出：2460
}
