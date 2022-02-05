package com.bobabelga.ProxyDesignPattern;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listSites = Arrays.asList("Bobabelga", "Twitter", "Facebook", "Google", "Pinterest");
        InternetServiceProvider provider = new InternetProxy();
        for (String url : listSites) {
            System.out.println(provider.serveSite(url));
        }
    }
}
