package org.apache.commons.mail;

import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class HtmlEmailRunnerTest {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(HtmlEmailTest.class);
        for(Failure failure:result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("批量测试结果:"+result.wasSuccessful());
    }
}
