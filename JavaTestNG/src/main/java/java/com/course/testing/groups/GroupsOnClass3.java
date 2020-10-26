package java.com.course.testing.groups;

import org.testng.annotations.Test;

/**
 * @liaojinjun GroupsOnClass3
 * @Description TODO
 * @Date 2020-10-18 15:41
 * @Created by liaojinjun
 */
@Test(groups="teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行方法1");
    }
    public void steacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行方法2");
    }
}
