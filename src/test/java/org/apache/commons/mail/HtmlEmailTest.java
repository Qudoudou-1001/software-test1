package org.apache.commons.mail;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HtmlEmailTest {
    private HtmlEmail email;
    @Before
    public void setUp() throws Exception {
        email = new HtmlEmail();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void setFrom() throws EmailException {
        String str1="913637919@qq.com";
        String str2="1683077739@qq.com";
        Assert.assertEquals(str1,email.setFrom(str1).getFromAddress().toString());
        Assert.assertEquals(str2,email.setFrom(str2).getFromAddress().toString());
    }

    @Test
    public void addTo() throws EmailException {
        String str1="[913637919@qq.com]";
        Assert.assertEquals(str1,email.addTo("913637919@qq.com").getToAddresses().toString());
    }

    @Test
    public void setSubject() {
        String str1="第一次测试！";
        String str2="第二次测试！";
        Assert.assertEquals(str1,email.setSubject(str1).getSubject().toString());
        Assert.assertEquals(str2,email.setSubject(str2).getSubject().toString());
    }
}