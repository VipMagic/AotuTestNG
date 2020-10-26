package java.com.course.testing.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @liaojinjun GroupsOnMethod
 * @Description TODO
 * @Date 2020-10-18 15:18
 * @Created by liaojinjun
 */

public class GroupsOnMethod {

    @Test(groups="server")
    public void test1(){
        System.out.println("服务端组的测试方法1");
    }
    @Test(groups="server")
    public void test2(){
        System.out.println("服务端组的测试方法2");
    }
    @Test(groups="client")
    public void test3(){
        System.out.println("客户端组的测试方法3");
    }
    @Test(groups="client")
    public void test4(){
        System.out.println("客户端组的测试方法4");
    }


    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("这个是服务端组运行之前运行的方法-beforeGroupOnServer");
    }

    @AfterGroups("server")
    public void AforeGroupOnServer(){
        System.out.println("这个是服务端组运行之后运行的方法-AforeGroupOnServer");
    }

    @BeforeGroups("client")
    public void beforeGroupOnClient(){
        System.out.println("这个是客户端组运行之前运行的方法-beforeGroupOnClient");
    }

    @AfterGroups("client")
    public void AforeGroupOnclient(){
        System.out.println("这个是客户端组运行之后运行的方法-AforeGroupOnclient");
    }








}
