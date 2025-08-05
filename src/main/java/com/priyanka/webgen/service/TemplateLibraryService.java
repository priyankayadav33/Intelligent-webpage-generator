package com.priyanka.webgen.service;

import com.priyanka.webgen.model.TemplateMetadata;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TemplateLibraryService {

    private final List<TemplateMetadata> templates;

    public TemplateLibraryService() {
        this.templates = new ArrayList<>();

        // Sample templates
        templates.add(new TemplateMetadata("Modern Academic", "Education", "left-sidebar", "Clean academic layout with sidebar and publications section."));
        templates.add(new TemplateMetadata("Corporate Profile", "Business", "top-nav", "Professional template with top navigation and service sections."));
        templates.add(new TemplateMetadata("Creative Portfolio", "Design", "grid", "A portfolio layout with a focus on visuals and creative projects."));
        templates.add(new TemplateMetadata("Minimal Research", "Education", "minimal", "Simple, text-focused layout for researchers."));
    }

    public List<TemplateMetadata> getAllTemplates() {
        return templates;
    }

    public List<TemplateMetadata> getTemplatesByIndustry(String industry) {
        return templates.stream()
                .filter(t -> t.getIndustry().equalsIgnoreCase(industry))
                .collect(Collectors.toList());
    }
}
