package palindrome_numbers;
import com.maia.vinicius.palindrome_number.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SolutionTest {
    @Test
    public void testPalindromeNumber_basicCase() {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(121);
        assertTrue(result);
    }

    @Test
    public void testPalindromeNumber_negativeNumberCase() {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(-121);
        assertFalse(result);
    }

    @Test
    public void testPalindromeNumber_notPalindromeCase() {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(1231);
        assertFalse(result);
    }
}
