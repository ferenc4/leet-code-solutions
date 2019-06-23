package challenges.medium.daily_temperatures.v1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="https://github.com/ferenc4">Ferenc Fazekas</a>
 */
public class SolutionTest {

    @Test
    public void testAscending() {
        int[] actual = new Solution().dailyTemperatures(new int[]{1, 2, 3});
        assertThat(actual).isEqualTo(new int[]{1, 1, 0});
    }

    @Test
    public void testDescending() {
        int[] actual = new Solution().dailyTemperatures(new int[]{1, 2, 3});
        assertThat(actual).isEqualTo(new int[]{1, 1, 0});
    }

    @Test
    public void testMixed() {
        int[] actual = new Solution().dailyTemperatures(new int[]{3, 2, 4, 2, 5});
        assertThat(actual).isEqualTo(new int[]{2, 1, 2, 1, 0});
    }
}