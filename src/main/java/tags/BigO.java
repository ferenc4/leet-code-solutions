package tags;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static tags.BigO.Complexity.UNDEFINED;

/**
 * @author <a href="https://github.com/ferenc4">Ferenc Fazekas</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface BigO {
    static enum Complexity {
        UNDEFINED(),
        N("n"),
        LOGN("log(n)");

        private List<String> value;

        Complexity(String... value) {
            this.value = Arrays.asList(value);
        }

        public List<String> getValue() {
            return value;
        }
    }

    Complexity time() default UNDEFINED;

    Complexity space() default UNDEFINED;
}