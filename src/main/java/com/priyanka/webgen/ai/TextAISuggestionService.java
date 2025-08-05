package com.priyanka.webgen.ai;

import com.priyanka.webgen.dto.AISuggestionResponse;

public interface TextAISuggestionService {
    AISuggestionResponse generateSuggestions(String inputText);
}
