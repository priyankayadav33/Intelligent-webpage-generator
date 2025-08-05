package com.priyanka.webgen.scraper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScraperUtils {

    /**
     * Returns text content of first matching element or empty string.
     */
    public static String getElementText(Document doc, String cssQuery) {
        Element element = doc.selectFirst(cssQuery);
        return element != null ? element.text().trim() : "";
    }

    /**
     * Returns attribute value of first matching element or empty string.
     */
    public static String getElementAttr(Document doc, String cssQuery, String attr) {
        Element element = doc.selectFirst(cssQuery);
        return element != null ? element.attr(attr).trim() : "";
    }

    /**
     * Extracts text from multiple elements matching the query.
     */
    public static String getMultipleElementsText(Document doc, String cssQuery, String delimiter) {
        Elements elements = doc.select(cssQuery);
        StringBuilder sb = new StringBuilder();
        for (Element el : elements) {
            if (sb.length() > 0) sb.append(delimiter);
            sb.append(el.text().trim());
        }
        return sb.toString();
    }

    /**
     * Safely checks if element exists.
     */
    public static boolean elementExists(Document doc, String cssQuery) {
        return doc.selectFirst(cssQuery) != null;
    }
}
