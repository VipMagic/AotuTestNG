package java.com.course.testing;


import org.testng.annotations.*;


/**
 * @liaojinjun BasicAnnotation
 * @Description TODO
 * @Date 2020-10-13 22:37
 * @Created by liaojinjun
 */
public class BasicAnnotation {

    @Test
    public void testCase1() {
        System.out.println("这个是一条测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("这个是一条测试用例2");
    }

    @BeforeMethod
    public void beoreMethod() {
        System.out.println("beoreMethod这个是在测试方法运行之前运行");

    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("AfterMethod这个是在测试方法运行之后运行");

    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("BeforeClass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("BeforeClass这是在类运行之后运行的方法");
    }


    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("BeforeSuite这是在测试套件运行之前运行的方法");

    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("AfterSuite这是在测试套件运行之后运行的方法");

    }
}

