package com.priyanka.webgen.service;


import com.priyanka.webgen.dto.AISuggestionResponse;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AISuggestionServiceImpl implements AISuggestionService {

    @Override
    public AISuggestionResponse getColorSuggestions(String industry) {
        // Dummy color palette suggestion based on industry
        return new AISuggestionResponse(Arrays.asList("#1A73E8", "#34A853", "#FBBC05"));
    }

    @Override
    public AISuggestionResponse getLogoSuggestions(String industry) {
        // Dummy logo URLs based on industry (could later be AI-generated or local images)
        return new AISuggestionResponse(Arrays.asList(
            "https://example.com/logos/edu1.png",
            "https://example.com/logos/edu2.png"
        ));
    }

    @Override
    public AISuggestionResponse getTemplateSuggestions(String industry) {
        // Dummy template preview links
        return new AISuggestionResponse(Arrays.asList(
            "https://example.com/templates/modern.html",
            "https://example.com/templates/minimal.html"
        ));
    }
}
