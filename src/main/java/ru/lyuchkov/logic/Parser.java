package ru.lyuchkov.logic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Parser {
    public static Document getPage(String url) throws IOException {
        Document page = Jsoup.parse(new URL(url), 30000);
        return page;
    }
}
