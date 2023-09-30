package com.br.fiap.checkpointpt2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

    @InjectMocks
    private Service service;


    @Test
    public void testFindSingleNumber() {
        int[] nums = {4, 1, 2, 1, 2};
        int expectedResult = 4;
        int actualResult = service.findSingleNumber(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDontFindSingleNumber() {
        int[] nums = {2, 1, 2, 1, 2};
        int expectedResult = -1;
        int actualResult = service.findSingleNumber(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPalindrome() {
        String palindromeString = "A man, a plan, a canal, Panama";
        boolean isPalindrome = service.isPalindrome(palindromeString);
        assertTrue(isPalindrome);
    }

    @Test
    public void testIsNotPalindrome() {
        String nonPalindromeString = "hello";
        boolean isPalindrome = service.isPalindrome(nonPalindromeString);
        assertTrue(!isPalindrome);
    }
}