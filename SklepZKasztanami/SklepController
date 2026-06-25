package com.kasztany.sklep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/kasztany")
public class SklepController {

    @GetMapping("")
    @ResponseBody
    @CrossOrigin
    public Iterable<Kasztan> getAll() {
        List<Kasztan> kasztany = new ArrayList<>();
        kasztany.add(new Kasztan(2137,"oval","smol","classic brown", 7, 15.99, "https://www.swiatkwiatow.pl//thumb.php?img=foto_art/1375189381.jpg&w=670"));
        kasztany.add(new Kasztan(1337,"round","medium","dark brown", 12, 21.99, "https://sp184lodz.edu.pl/wp-content/uploads/2018/11/Kasztanobranie.png"));
        kasztany.add(new Kasztan(69420, "eliptical","big","burgundy brown", 16, 25.99,   "https://img.wprost.pl/img/kasztany-wlasciwosci-lecznicze/55/7c/d1290069747b02f01097f78d4514.webp"));
        return kasztany;
    }
}
