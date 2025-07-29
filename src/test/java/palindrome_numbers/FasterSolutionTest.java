package palindrome_numbers;
import com.maia.vinicius.palindrome_number.FasterSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FasterSolutionTest {
    @Test
    public void testPalindromeNumber_basicCase() {
        FasterSolution solution = new FasterSolution();
        boolean result = solution.isPalindrome(121);
        assertTrue(result);
    }

    @Test
    public void testPalindromeNumber_negativeNumberCase() {
        FasterSolution solution = new FasterSolution();
        boolean result = solution.isPalindrome(-121);
        assertFalse(result);
    }

    @Test
    public void testPalindromeNumber_notPalindromeCase() {
        FasterSolution solution = new FasterSolution();
        boolean result = solution.isPalindrome(1231);
        assertFalse(result);
    }
}
