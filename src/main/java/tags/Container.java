package tags;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <a href="https://github.com/ferenc4">Ferenc Fazekas</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Container {
    public enum ContainerType {
        STACK("stack");

        private String value;

        ContainerType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    ContainerType value();
}
