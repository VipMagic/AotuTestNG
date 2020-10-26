package java.com.course.testing;

import org.testng.annotations.Test;

/**
 * @liaojinjun IqnoreTest
 * @Description TODO
 * @Date 2020-10-18 14:57
 * @Created by liaojinjun
 */
public class IqnoreTest {

    @Test
    public void Iqnore1(){
        System.out.println("Iqnore1执行");
    }
    @Test(enabled=false)
    public void Iqnore2(){
        System.out.println("Iqnore2-false不执行");
    }

    @Test(enabled=true)
    public void Iqnore3(){
        System.out.println("Iqnore3-turn执行");
    }
}

