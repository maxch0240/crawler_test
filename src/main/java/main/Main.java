package main;

import linkextracter.Extractor;
import htmlparser.Parser;


import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {
        final int maxLinkDepth = 8, maxPageLimit = 10000;
        String[] terms = {"Tesla", "Musk", "GigaFactory", "Elon Musk"};

        String seedUrl = "https://en.wikipedia.org/wiki/Elon_Musk";
        Parser parser = new Parser();
        parser.setDocument(seedUrl);

/*        int counter = parser.findByTerm("Tesla");
        System.out.println(counter);*/

        Extractor extracter = new Extractor(parser.getDoc());
        ArrayList<String> links = extracter.getLinks();
        for(String el: links){
            System.out.println(el);
        }
    }
}
