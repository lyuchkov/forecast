package ru.lyuchkov.logic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Parser {
    public Parser() {
    }
    public String tempYandex(){
            Document page = null;
            try {
                page = Jsoup.connect("https://yandex.ru/pogoda/saint-petersburg").get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String temp = page.select("div[class=temp fact__temp fact__temp_size_s]").text();
            return temp;
        }
    public String barYandex(){
        Document page = null;
        try {
            page = Jsoup.connect("https://yandex.ru/pogoda/saint-petersburg").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String bar = page.select("div[class=term term_orient_v fact__pressure]").text();
        return bar;
    } public String windYandex(){
        Document page = null;
        try {
            page = Jsoup.connect("https://yandex.ru/pogoda/saint-petersburg").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String bar = page.select("div[class=term term_orient_v fact__wind-speed]").text();
        return bar;
    } public String tempGismeteo(){
            Document page = null;
            try {
                page = Jsoup.connect("https://www.gismeteo.ru").get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String temp = page.select("span[class=value unit unit_temperature_c]").first().text();
            return temp;
        }
    public String barGismeteo(){
        Document page = null;
        try {
            page = Jsoup.connect("https://www.gismeteo.ru").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String bar = page.select("span[class=unit unit_pressure_mm_hg_atm]").first().text();
        return bar;
    } public String windGismeteo(){
        Document page = null;
        try {
            page = Jsoup.connect("https://www.gismeteo.ru/weather-sankt-peterburg-4079/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String bar = page.select("span[class=unit unit_wind_m_s]").first().text();
        return bar;
    }

}
