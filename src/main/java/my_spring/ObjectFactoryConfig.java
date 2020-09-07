package my_spring;

import lombok.Setter;

import java.util.Map;

public interface ObjectFactoryConfig {
    Map<Class, Class> INTERFACE_TO_IMPL = Map.of(
            Cleaner.class, CleanerImpl.class,
            Speaker.class, ConsoleSpeaker.class);
}
