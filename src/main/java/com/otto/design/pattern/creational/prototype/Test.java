package com.otto.design.pattern.creational.prototype;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-14 23:14
 **/
public class Test {
    public static void main(String[]args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化的模板");
        for (int i = 0; i < 10; i++) {
            /** 使用克隆出来的Mail */
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名" + i + "@126.com");
            mailTemp.setContent("恭喜您，此次活动中奖了！");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}