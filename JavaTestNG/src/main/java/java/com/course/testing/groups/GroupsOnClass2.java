package java.com.course.testing.groups;

import org.testng.annotations.Test;

/**
 * @liaojinjun GroupsOnClass2
 * @Description TODO
 * @Date 2020-10-18 15:41
 * @Created by liaojinjun
 */

@Test(groups="stu")
public class GroupsOnClass2 {


    public void stu1(){
        System.out.println("GroupsOnClass2中的stu1运行方法1");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2中的stu2运行方法2");
    }

}
