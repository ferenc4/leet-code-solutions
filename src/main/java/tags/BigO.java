package tags;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="https://github.com/ferenc4">Ferenc Fazekas</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface BigO {
    enum ComplexityComponent {
        N("n"),
        LOGN("log(n)");

        private String value;

        ComplexityComponent(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    ComplexityComponent[] time() default {};

    ComplexityComponent[] space() default {};
}