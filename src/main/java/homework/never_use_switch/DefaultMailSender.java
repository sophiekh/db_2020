package homework.never_use_switch;

public class DefaultMailSender implements MailSender {

    @Override
    public void sendMail(MailInfo mailInfo) {
        throw new IllegalStateException(mailInfo.getMailType()  + " doesn't exist.");
    }
}
