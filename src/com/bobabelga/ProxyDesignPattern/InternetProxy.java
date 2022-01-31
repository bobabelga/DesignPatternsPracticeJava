package com.bobabelga.ProxyDesignPattern;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider{
    List<String> blockedSites = Arrays.asList("Twitter","Facebook","Google");
    @Override
    public String serveSite(String url) {
        internetLogUrl(url);
        if (blockedSites.contains(url))
            return "This Site is Blocked";
        return new Djezzy().serveSite(url);
    }

    private void internetLogUrl(String url) {
        System.out.printf("[%d] -> %s requested \n",System.currentTimeMillis(),url);
    }
}
