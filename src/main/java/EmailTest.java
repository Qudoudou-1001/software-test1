import org.apache.commons.mail.*;

import java.io.File;

public class EmailTest {
    public static void main(String[] args) throws EmailException, EmailException {
            HtmlEmail email = new HtmlEmail();
    // 设置基本信息
            email.setHostName("smtp.qq.com");
            email.setAuthenticator(new DefaultAuthenticator("913637919@qq.com", "cmbzvjwxboodbded"));
            email.setFrom("913637919@qq.com");
            email.addTo("1683077739@qq.com");
            email.setSubject("测试邮件！");
            System.out.println(email.getFromAddress().toString());
    // 生成图片标识
            email.setCharset(EmailConstants.UTF_8);
            email.setHtmlMsg("<html>测试！</html>");
    // 额外提示
            email.setTextMsg("您的邮件不支持html格式");
    // 附件
            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath("C:\\Users\\86176\\Desktop\\software-test1\\test.jpg");
            email.attach(attachment);
    // 发送
            email.send();

    }
}
