package my_spring;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        Map<Class<?>, Class<?>> map = Map.of(
                Speaker.class, ConsoleSpeaker.class,
                Cleaner.class, EvaluatedCleaner.class
                );


        JavaConfig config = new JavaConfig(map, "my_spring");
        ApplicationContext context = new ApplicationContext(config);

        IRobot iRobot = context.getBean(IRobot.class);

        iRobot.cleanRoom();
    }
}
