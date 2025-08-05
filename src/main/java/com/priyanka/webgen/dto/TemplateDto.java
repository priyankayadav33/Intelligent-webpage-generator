package com.priyanka.webgen.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TemplateDto {
    private Long id;
    private String name;
    private String previewImageUrl;
    private String description;
}
