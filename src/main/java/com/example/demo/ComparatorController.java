package com.example.demo;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/compare")
public class ComparatorController {

    //**
    //compare?left=ASDF2&right=ZZZZ + -H COMPARE_MODE=ASC/DESC -> "Right"
    //left=ASDF2&RIGHT=ZZZZ + COMPARE_MODE=DESC -> "Left"

    public String helper(String left, String right) {
        int result = left.compareToIgnoreCase(right);
        if (result < 0) {
            return "LEFT";
        } else if (result > 0) {
            return "RIGHT";
        } else {
            return "EQUAL";
        }
    }

    @GetMapping
    public String compare(@RequestParam String left,
                          @RequestParam String right,
                          @RequestHeader("COMPARE_MODE") String header) {

        if (header.equals("ASC")) {
            return helper(left, right);
        } else if (header.equals("DESC")) {
            return helper(right, left);
        } else {
            return "Error";
        }

    }

}
