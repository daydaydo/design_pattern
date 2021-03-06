package com.otto.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * program: design_pattern
 * description: MailUtil
 * *@author: gqchu
 * create: 2021-07-14 23:14
 **/
public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学，邮件地址:{1},邮件内容:{2}发送邮件成功！";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储OriginMail记录,OriginMail："+mail.getContent());
    }
}
