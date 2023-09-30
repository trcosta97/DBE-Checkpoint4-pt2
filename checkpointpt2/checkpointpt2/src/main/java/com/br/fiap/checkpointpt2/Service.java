package com.br.fiap.checkpointpt2;

@org.springframework.stereotype.Service
public class Service {


    public int findSingleNumber(int[] nums){
        int singleValue = -1;

        for (int i = 0; i < nums.length; i++) {
            boolean hasEqual = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    hasEqual = true;
                    break;
                }
            }
            if (!hasEqual) {
                singleValue = nums[i];
                break;
            }
        }
        return singleValue;
    }


    public boolean isPalindrome(String s) {
        String reverse = "";
        String formatedString = s.toLowerCase().replaceAll(" ", "").replaceAll(",", "").trim();

        for(int i = formatedString.length() - 1; i >= 0; i--){
            reverse = reverse + formatedString.charAt(i);
        }

        System.out.println(formatedString);
        System.out.println(reverse);

        return formatedString.equals(reverse);
    }
}
