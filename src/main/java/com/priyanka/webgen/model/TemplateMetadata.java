package com.priyanka.webgen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateMetadata {
    private String name;
    private String industry;
    private String layout;
    private String description;
}
