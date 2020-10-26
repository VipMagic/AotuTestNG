package java.com.course.testing.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @liaojinjun DataProviderTest
 * @Description TODO
 * @Date 2020-10-20 22:55
 * @Created by liaojinjun
 */
public class DataProviderTest {


    @Test(dataProvider = "data")
    public void testDataProvider(String name, String age) {
        System.out.println("name=" + name + " age=" + age);
    }


    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"张三", "10"},
                {"张四", "20"},
                {"张五", "30"}
        };
        return o;
    }


    @Test(dataProvider = "methodData")
    public void test1(String name, String age) {
        System.out.println("test（1）name=" + name + " age=" + age);
    }


    @Test(dataProvider = "methodDate")
    public void test2(String name, String age) {
        System.out.println("test（2）name=" + name + " age=" + age);
    }


    @DataProvider(name = "methodDate")
    public Object[][] methodDateTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"张三三", 20},
                    {"张五五", 30}

            };

        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"张六六", 60},
                    {"张七七", 70}

            };


        }
        return result;


    }
}