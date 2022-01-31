package com.bobabelga.ProxyDesignPattern;

public class Djezzy implements InternetServiceProvider{
    @Override
    public String serveSite(String url) {
        return String.format("https://%s.com",url);
    }
}
