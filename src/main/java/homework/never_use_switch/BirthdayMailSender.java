package homework.never_use_switch;

public class BirthdayMailSender implements MailSender {

    @Override
    public void sendMail(MailInfo mailInfo) {
        // 80 lines of code which will send BIRTHDAY mail
        System.out.println("HAPPY BIRTHDAY " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
