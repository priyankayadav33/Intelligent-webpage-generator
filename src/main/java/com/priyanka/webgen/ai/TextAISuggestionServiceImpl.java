package com.priyanka.webgen.ai;

import com.priyanka.webgen.dto.AISuggestionResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TextAISuggestionServiceImpl implements TextAISuggestionService {

    @Override
    public AISuggestionResponse generateSuggestions(String inputText) {
        // 🔧 For now, return dummy suggestions based on input
        AISuggestionResponse response = new AISuggestionResponse();
        response.setSuggestions(Arrays.asList(
                "Use a clean, modern layout",
                "Highlight research publications",
                "Add a professional profile photo",
                "Include Google Scholar and LinkedIn links",
                "Add latest conference participation"
        ));
        return response;
    }
}
