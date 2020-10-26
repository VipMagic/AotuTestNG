package java.com.course.testing.suitle;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @liaojinjun SuitleConfig
 * @Description TODO
 * @Date 2020-10-14 23:42
 * @Created by liaojinjun
 */
public class SuitleConfig {


    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("BeforeSuite之前运行的方法-运行了");
    }


    @AfterSuite
    public void AfterSuite() {
        System.out.println("AfterSuite之后运行的方法--运行了");
    }


    @AfterTest
    public void AfterTest() {
        System.out.println("AfterTest测试运行之前");

    }
    @BeforeTest
    public void BeforeTest() {
        System.out.println("BeforeTest测试运行之后");

    }
}
