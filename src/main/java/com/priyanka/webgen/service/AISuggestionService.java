package com.priyanka.webgen.service;

import com.priyanka.webgen.dto.AISuggestionResponse;

public interface AISuggestionService {
    AISuggestionResponse getColorSuggestions(String industry);
    AISuggestionResponse getLogoSuggestions(String industry);
    AISuggestionResponse getTemplateSuggestions(String industry);
}
