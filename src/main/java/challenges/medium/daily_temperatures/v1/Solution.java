package challenges.medium.daily_temperatures.v1;

import tags.BigO;
import tags.Container;

import java.util.Stack;

import static tags.BigO.ComplexityComponent.N;
import static tags.Container.ContainerType.STACK;

/**
 * @author <a href="https://github.com/ferenc4">Ferenc Fazekas</a>
 * @implSpec <a href="https://leetcode.com/problems/daily-temperatures/">Specification</a>
 */
@BigO(time = {N})
@Container(STACK)
public class Solution {
    class Temperature {
        int index;
        short value;

        Temperature(int i, short val) {
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
