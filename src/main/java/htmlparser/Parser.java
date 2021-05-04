package htmlparser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public Document doc;

    public void getPage(String url) throws IOException {
        doc = Jsoup.connect("https://en.wikipedia.org/wiki/Elon_Musk")
                .userAgent("Chrome/4.0.249.0 Safari/532.5")
                .referrer("http://www.google.com")
                .get();

    }

    public int findByTerm(String term) {
        String page= doc.body().text();
        Pattern pattern = Pattern.compile(term);
        Matcher matcher = pattern.matcher(page);

        int count = 0;
        while (matcher.find())
            count++;

        return count;
    }
}
