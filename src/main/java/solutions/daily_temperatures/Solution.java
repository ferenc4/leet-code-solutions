package solutions.daily_temperatures;

import java.util.Stack;

/**
 * @author <a href="https://github.com/ferenc4">Ferenc Fazekas</a>
 */
public class Solution {
    class Temperature {
        int index;
        short value;

        public Temperature(int i, short val) {
            index = i;
            value = val;
        }
    }

    public int[] dailyTemperatures(int[] T) {
        Stack<Temperature> temps = new Stack<Temperature>();
        int[] result = new int[T.length];
        int filled = 0;

        for (int i = 0; i < T.length; i++) {
            short currentVal = (short) T[i];
            while (!temps.isEmpty() && temps.peek().value < currentVal) {
                int index = temps.pop().index;
                result[index] = i - index;
                filled++;
            }
            temps.add(new Temperature(i, currentVal));
        }
        while (!temps.isEmpty()) {
            Temperature t = temps.pop();
            result[t.index] = 0;
        }
        return result;
    }
}
