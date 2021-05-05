package linkextracter;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Extractor {
    private Document doc;
    private ArrayList<String> links = new ArrayList<String>();

    public Extractor(Document doc) {
        this.doc = doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    public ArrayList<String> getLinks() {
        Elements elLinks = doc.select("a[href]");
        for (Element el : elLinks) {
            links.add(el.attr("href"));
        }
        return links;
    }
}
