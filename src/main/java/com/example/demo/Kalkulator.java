package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kalkulator")
public class Kalkulator {
    //kalkulator/dodaj/1/2
    @GetMapping("/dodaj/{x}/{y}")
    public int dodaj(@PathVariable int x, @PathVariable int y) {
        return x + y;
    }

    //kalkulator/odejmij/1/2
    @GetMapping("/odejmij/{x}/{y}")
    public int odejmij(@PathVariable int x, @PathVariable int y) {
        return x - y;
    }


        //kalkulator/pomnóż/1/2

        //kalkulator/podziel/1/2

    }

