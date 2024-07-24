package top.anyel.appd.shared.utils.logger;


import org.springframework.stereotype.Component;

@Component
public class CustomLoggerFactory {
    public CustomLogger getLogger(Class<?> clazz) {
        return new CustomLogger(clazz);
    }
}
