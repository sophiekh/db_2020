package homework.never_use_switch;

import lombok.Getter;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MailTypeConfig {
    private static Map<Integer, MailSender> mailTypes = new HashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<Integer, MailSender>(1, new WelcomeMailSender()),
            new AbstractMap.SimpleEntry<Integer, MailSender>(2, new CallbackMailSender()),
            new AbstractMap.SimpleEntry<Integer, MailSender>(3, new BirthdayMailSender())
    ));

    public static MailSender getMailSenderByCode(int mailTypeCode) {
        return mailTypes.getOrDefault(mailTypeCode, new DefaultMailSender());
    }
}
