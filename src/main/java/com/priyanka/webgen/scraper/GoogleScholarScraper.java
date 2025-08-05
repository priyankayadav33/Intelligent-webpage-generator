package com.priyanka.webgen.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Optional;

@Component
public class GoogleScholarScraper {

    public Optional<ScholarProfile> scrapeScholarProfile(String scholarUrl) {
        try {
            Document doc = Jsoup.connect(scholarUrl).get();

            String name = doc.select("#gsc_prf_in").text();
            String affiliation = doc.select(".gsc_prf_il").first().text();
            String interests = doc.select(".gsc_prf_ila").eachText().toString();

            return Optional.of(ScholarProfile.builder()
                    .name(name)
                    .affiliation(affiliation)
                    .interests(interests)
                    .build()
            );

        } catch (IOException e) {
            System.err.println("❌ Failed to scrape: " + e.getMessage());
            return Optional.empty();
        }
    }
}
