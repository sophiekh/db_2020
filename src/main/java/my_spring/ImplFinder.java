package my_spring;

import org.reflections.Reflections;

import java.util.Set;

public class ImplFinder {
    private Reflections scanner = new Reflections("my_spring");

    public Class findImplementation(Class type) {
        if (!type.isInterface()) {
            return type;
        }
        else {
            Set<Class> impls = scanner.getSubTypesOf(type);
            if (impls.size() == 1) {
                return impls.iterator().next();
            }
            Class impl = ObjectFactoryConfig.INTERFACE_TO_IMPL.get(type);
            if (impl == null) {
                throw new IllegalStateException(type + " implementation not found.");
            }
            return impl;
        }
    }
}
