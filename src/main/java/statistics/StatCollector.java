package statistics;

import org.jsoup.nodes.Document;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StatCollector {
    public int findByTerm(String term, Document doc) {
        String page = doc.body().text();
        Pattern pattern = Pattern.compile(term);
        Matcher matcher = pattern.matcher(page);

        int count = 0;
        while (matcher.find())
            count++;

        return count;
    }
}
