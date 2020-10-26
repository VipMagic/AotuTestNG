package java.com.course.testing.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @liaojinjun ParamterTest
 * @Description TODO
 * @Date 2020-10-18 16:58
 * @Created by liaojinjun
 *
 * testng参数化
 */
public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void paramterTest1(String name,int age) {
        System.out.println("我叫："+name+"，今年："+age+"岁");

    }
    public void paramterTest2(){

    }
}
