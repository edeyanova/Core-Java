package com.hackbulgaria.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WebCrawler {
	
    public static void main(String[] args) throws Exception {


        URL url = new URL(args[0]);
        String needle = args[1];


        crawler(url, needle);
    }
	
    private static List<String> my_urls = new ArrayList<>();


    public static void crawler(URL url, String needle) throws IOException {
        my_urls.add(url.toString());
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));


        String strTemp = "";
        String in;
        while (null != (in = br.readLine())) {
            strTemp += in + "\n";
        }
        if (strTemp.contains(needle)) {
            System.out.println(url);
        } else {
            for (String link : getAllLinks(strTemp)) {
                if (!link.endsWith("index.html") && !link.contains("http://") && !link.contains("https://")) {
                    if (!my_urls.contains(new URL(url.toString() + link).toString())) {
                        crawler(new URL(url.toString() + link), needle);
                        my_urls.add(new URL(url.toString() + link).toString());
                    }
                }
            }
        }
        br.close();
    }


    private static List<String> getAllLinks(String content) {
        ArrayList<String> resultList = new ArrayList<>();
        String regex = "<a.*?href=\"((?!javascript).*?)\".*?>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            resultList.add(matcher.group(1));
        }
        return resultList;
    }
}
