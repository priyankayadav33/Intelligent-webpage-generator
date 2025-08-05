package com.priyanka.webgen.scraper;
import com.priyanka.webgen.dto.LinkedInProfile;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Optional;

@Component
public class LinkedInScraper {

    public Optional<LinkedInProfile> scrapeLinkedInProfile(String url) {
        try {
            // Send HTTP GET request
            Document doc = Jsoup.connect(url)
                                .userAgent("Mozilla/5.0") // fake as a browser
                                .get();

            // Example selectors (may change as LinkedIn changes HTML)
            String name = doc.select("h1.text-heading-xlarge").text();
            String headline = doc.select("div.text-body-medium").first().text();
            String location = doc.select("span.text-body-small").first().text();

            LinkedInProfile profile = LinkedInProfile.builder()
                    .name(name)
                    .headline(headline)
                    .location(location)
                    .build();

            return Optional.of(profile);

        } catch (IOException e) {
            System.out.println("Error scraping LinkedIn: " + e.getMessage());
            return Optional.empty();
        } catch (Exception ex) {
            System.out.println("Unexpected error: " + ex.getMessage());
            return Optional.empty();
        }
    }
}
