package com.br.fiap.checkpointpt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/controller")
public class Controller {

    @Autowired
    Service service;


    @PostMapping("/single-number")
    public int findSingleNumber(@RequestBody int[] nums){
        return service.findSingleNumber(nums);

    }

    @PostMapping("/is-palindrome")
    public boolean isPalindrome(@RequestBody String s) {
        return service.isPalindrome(s);
    }
}
