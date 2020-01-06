package ru.lyuchkov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
        Document page = (Document) parser.getPage();
        System.out.println(page);

        return "index";
    }
}
