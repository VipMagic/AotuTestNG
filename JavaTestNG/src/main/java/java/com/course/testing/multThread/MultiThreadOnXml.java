package java.com.course.testing.multThread;

import org.testng.annotations.Test;

/**
 * @liaojinjun MultiThreadOnXml
 * @Description TODO
 * @Date 2020-10-20 23:39
 * @Created by liaojinjun
 */


public class MultiThreadOnXml {

    @Test(invocationCount =10,threadPoolSize = 5)
    public void test1(){
        System.out.println(1);
        System.out.println("多线程数1:"+Thread.currentThread().getId());

    }
    @Test(invocationCount =10,threadPoolSize = 5)
    public void test2(){
        System.out.println(2);
        System.out.println("多线程数2:"+Thread.currentThread().getId());

    }
    @Test(invocationCount =10,threadPoolSize = 5)
    public void test3(){
        System.out.println(3);
        System.out.println("多线程数3:"+Thread.currentThread().getId());

    }

}
