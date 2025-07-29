package roman_to_integer;

import com.maia.vinicius.roman_to_integer.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
     @Test
     public void testRomanToInteger_basicCase() {
         Solution solution = new Solution();
         int result = solution.romanToInt("III");
         assertEquals(result, 3);
     }

    @Test
    public void testRomanToInteger_multipleCase() {
        Solution solution = new Solution();
        int result = solution.romanToInt("LVIII");
        assertEquals(result, 58);
    }

    @Test
    public void testRomanToInteger_lastCase() {
        Solution solution = new Solution();
        int result = solution.romanToInt("MCMXCIV");
        assertEquals(result, 1994);
    }
}
