package ru.lyuchkov.logic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Parser {
    public Parser() throws IOException {
    }
     Document pageYandex = Jsoup.connect("https://yandex.ru/pogoda/saint-petersburg").get();
     Document pageGismeteo = Jsoup.connect("https://www.gismeteo.ru").get();
     Document pageRambler = Jsoup.connect("https://weather.rambler.ru/v-sankt-peterburge/").get();

    public String tempYandex(){
            String temp = pageYandex.select("div[class=temp fact__temp fact__temp_size_s]").text();
            return temp;
        }
    public String barYandex(){
            String bar = pageYandex.select("div[class=term term_orient_v fact__pressure]").text();
        return bar;
    } public String windYandex(){
        String bar = pageYandex.select("div[class=term term_orient_v fact__wind-speed]").text();
        return bar;
    } public String tempGismeteo(){
            String temp = pageGismeteo.select("span[class=value unit unit_temperature_c]").first().text();
            return temp;
        }
    public String barGismeteo(){
        String bar = pageGismeteo.select("span[class=unit unit_pressure_mm_hg_atm]").first().text();
        return bar;
    } public String windGismeteo(){
        String bar = pageGismeteo.select("span[class=unit unit_wind_m_s]").first().text();
        return bar;
    }
    //Мне лень добавлять еще,  представь тут еще 3 таких метода
}
