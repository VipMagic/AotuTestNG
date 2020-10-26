package java.com.course.testing;

import org.testng.annotations.Test;

/**
 * @liaojinjun ExpectedExceptiom
 * @Description TODO
 * @Date 2020-10-18 16:13
 * @Created by liaojinjun
 *
 * 异常测试
 */
public class ExpectedExceptiom {

    /*
     * 1、什么时候会用到异常测试
     * 2、比如我们的期望结果为某一个异常测试的时候
     * 3、比如：我们传入了某些不合法的参数，程序跑出异常
     * 4、也就是是我们的语气结果就是这个异常。
     *
     */
    //这个是一个异常的测试用例
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExptionFailed(){
        System.out.println("这个一个异常的测试");
    }
    //这个是一个成功的测试用例

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExptionSuccess(){
        System.out.println("这个一个成功的测试");
        throw new RuntimeException();
    }



}
