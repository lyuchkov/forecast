package ru.lyuchkov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.lyuchkov.logic.Parser;

import org.jsoup.Jsoup;

import javax.swing.text.Document;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) throws IOException {
        Parser parser = new Parser();
        model.addAttribute("yandexTemp", parser.tempYandex());
        model.addAttribute("yandexBar", parser.barYandex());
        model.addAttribute("yandexWind", parser.windYandex());
        model.addAttribute("gisTemp", parser.tempGismeteo());
        model.addAttribute("gisBar", parser.barGismeteo());
        model.addAttribute("gisWind", parser.windGismeteo());
        return "index";
    }
}
