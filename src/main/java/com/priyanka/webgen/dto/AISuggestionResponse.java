package com.priyanka.webgen.dto;

import java.util.List;

public class AISuggestionResponse {
    private List<String> suggestions;

    // ✅ No-arg constructor
    public AISuggestionResponse() {
    }

    // ✅ Param constructor
    public AISuggestionResponse(List<String> suggestions) {
        this.suggestions = suggestions;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }
}
