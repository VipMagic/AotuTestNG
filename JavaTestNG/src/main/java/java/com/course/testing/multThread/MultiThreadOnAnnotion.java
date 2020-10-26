package java.com.course.testing.multThread;

import org.testng.annotations.Test;

/**
 * @liaojinjun MultiThreadOnAnnotion
 * @Description TODO
 * @Date 2020-10-20 23:25
 * @Created by liaojinjun
 *
 * 多线程testng
 */
public class MultiThreadOnAnnotion {

    @Test(invocationCount =10,threadPoolSize = 5)
    public  void test(){
        System.out.println(1);
        System.out.println("多线程数:"+Thread.currentThread().getId());

    }
}
