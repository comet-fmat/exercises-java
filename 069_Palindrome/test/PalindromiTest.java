import org.junit.Test;
import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;

@Points("69")
public class PalindromiTest {
    public void notPalindromi(String s) {
        assertFalse("String \""+s+"\" is not a palindrome! Your program claimed it is.",
                    Palindromi.palindrome(s));
    }

    public void isPalindromi(String s) {
        assertTrue("String \""+s+"\" is a palindrome! Your program claimed it's not.",
                   Palindromi.palindrome(s));
    }

    @Test
    public void test1() {
        isPalindromi("");
    }

    @Test
    public void test2() {
        isPalindromi("a");
    }

    @Test
    public void test3() {
        notPalindromi("ax");
    }

    @Test
    public void test4() {
        notPalindromi("axda");
    }

    @Test
    public void test5() {
        notPalindromi("abc");
    }

    @Test
    public void test6() {
        isPalindromi("aba");
    }

    @Test
    public void test7() {
        isPalindromi("abccba");
    }

    @Test
    public void test8() {
        notPalindromi("abcc");
    }

    @Test
    public void test9() {
        notPalindromi("abca");
    }

    @Test
    public void test10() {
        isPalindromi("saippuakauppias");
    }
}