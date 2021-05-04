package main;

import htmlparser.Parser;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] terms = {"Tesla", "Musk", "GigaFactory", "Elon Musk"};
        int linkDepth = 8, pageLimit = 10000;
        String seedUrl = "https://en.wikipedia.org/wiki/Elon_Musk";
        Parser parser = new Parser();
        parser.getPage(seedUrl);

        int counter = parser.findByTerm("Tesla");
        System.out.println(counter);
    }
}
