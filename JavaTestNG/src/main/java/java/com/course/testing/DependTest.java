package java.com.course.testing;

import org.testng.annotations.Test;

/**
 * @liaojinjun DependTest
 * @Description TODO
 * @Date 2020-10-18 16:39
 * @Created by liaojinjun
 * 依赖测试
 */
public class DependTest {
    @Test
    public void  test1(){
        System.out.println("test依赖测试test1");
        throw new RuntimeException();

    }

    @Test(dependsOnMethods = {"test1"})
    public void  test2(){
        System.out.println("test依赖测试test2");

    }



}
