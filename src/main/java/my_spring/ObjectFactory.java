package my_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.Set;


/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {

    private ImplFinder implFinder = new ImplFinder();

    private static ObjectFactory objectFactory = new ObjectFactory();

    private ObjectFactory() {
    }

    public static ObjectFactory getInstance() {
        return objectFactory;
    }

    @SneakyThrows
    public Object createObject(Class type) {
        //todo finish this
        // if type is concrete class, just create and return it's instance
        // if type is and interface, you should find appropriative impl.
        return implFinder.findImplementation(type).getDeclaredConstructor().newInstance();
    }
}
