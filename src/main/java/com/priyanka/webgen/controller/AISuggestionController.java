package com.priyanka.webgen.controller;

import com.priyanka.webgen.dto.AISuggestionResponse;
import com.priyanka.webgen.service.AISuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AISuggestionController {

    @Autowired
    private AISuggestionService aiSuggestionService;

    @GetMapping("/colors")
    public AISuggestionResponse suggestColors(@RequestParam String industry) {
        return aiSuggestionService.getColorSuggestions(industry);
    }

    @GetMapping("/logos")
    public AISuggestionResponse suggestLogos(@RequestParam String industry) {
        return aiSuggestionService.getLogoSuggestions(industry);
    }

    @GetMapping("/templates")
    public AISuggestionResponse suggestTemplates(@RequestParam String industry) {
        return aiSuggestionService.getTemplateSuggestions(industry);
    }
}
