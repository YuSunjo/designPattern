package com.example.designpattern.structure.facade;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("a");
        emailMessage.setTo("b");
        emailMessage.setSubject("오징어게임");
        emailMessage.setText("gogogogogo");

        emailSender.sendEmail(emailMessage);
    }

    // 이메일을 보내는 기능을 여러군데서 사용한다고 하면 유용함

    // spring - MailSender, PlatformTransactionManager

}
