package htmlparser;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;

public class Parser {
    private Document doc;
    private Connection con;
    private static ArrayList<String> visitedSites;

    public void setDocument(String url){
        try {
            con = Jsoup.connect(url);

            if(con.response().statusCode() == 200){
                visitedSites.add(url);
                doc = con.get();
            }
        } catch (IOException e) {
            System.out.println("wrong link");
        }

    }

    public Document getDoc() {
        return doc;
    }

}
