package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/test")
public class MojPierwszyKontroler {

    @GetMapping("/pierwsza")
    public String pierwsza() {
        return "Hello World";
    }

    @GetMapping("/druga")
    public String drugA() {
        return "Hello World2";
    }

    @GetMapping("/czesc/{imie}")
    public String czesc(@PathVariable String imie) {
        return "Czesc " + imie;
    }

    //test/upper?wartosc=Mateusz -> "MATEUSZ"

    @GetMapping("/upper")
    public String upper(@RequestParam String wartosc) {
        return wartosc.toUpperCase();
    }

//    @GetMapping("/największy")
//    public int największy(@RequestParam List<Integer> liczby) {
//        liczby.sort(new Comparator<Integer>()) {
//            @Override
//            public int compare (Integer o1, Integer o2){
//            }
//        }

    //    @GetMapping("/concat")
//    public String upper(@RequestParam String pierwszy, @RequestParam String drugi) {
//        return pierwszy + drugi;
//    }
    @GetMapping("/autoryzacja")
    public String autoryzacja(@RequestHeader(value = "Nasza autoryzacja", required = false) String header) {
        if (header.equals("Secret123")) {
            return "Jesteś zalogowany";
        } else {
            return "Unauthorised";
        }
    }

    @PostMapping("/odwroc")
    public String odwroc(@RequestBody String wartosc) {
        StringBuilder sb = new StringBuilder();
        return sb.append(wartosc)
                .reverse()
                .toString();
    }

    public static class User {
        private String imie;
        private String nazwisko;

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }
    }

    @PostMapping("/user")
    public String user(@RequestBody User user) {
        return user.imie + " " + user.nazwisko;
    }

}

