package homework.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailDistributor {

    public void sendMailInfo(MailInfo mailInfo) {
        MailSender mailSender = MailTypeConfig.getMailSenderByCode(mailInfo.getMailType());
        mailSender.sendMail(mailInfo);
    }
}
