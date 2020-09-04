package homework.never_use_switch;

public class CallbackMailSender implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        // 80 lines of code which will send WELCOME mail
        System.out.println("EMAIL_CALLBACK " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
