package com.priyanka.webgen.controller;

import com.priyanka.webgen.model.TemplateMetadata;
import com.priyanka.webgen.service.TemplateLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/templates")
public class TemplateController {

    @Autowired
    private TemplateLibraryService templateLibraryService;

    @GetMapping
    public List<TemplateMetadata> getAllTemplates() {
        return templateLibraryService.getAllTemplates();
    }

    @GetMapping("/industry/{industry}")
    public List<TemplateMetadata> getTemplatesByIndustry(@PathVariable String industry) {
        return templateLibraryService.getTemplatesByIndustry(industry);
    }
}
