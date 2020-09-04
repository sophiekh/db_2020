package homework.never_use_switch;

public class WelcomeMailSender implements MailSender {

    @Override
    public void sendMail(MailInfo mailInfo) {
        // 60 lines of code which will send WELCOME mail
        System.out.println("WELCOME " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
