package com.priyanka.webgen.mapper;

import com.priyanka.webgen.dto.TemplateDto;
import com.priyanka.webgen.model.Template;

public class TemplateMapper {

    public static TemplateDto toDto(Template template) {
        return TemplateDto.builder()
                .id(template.getId())
                .name(template.getName())
                .previewImageUrl(template.getPreviewImageUrl())
                .description(template.getDescription())
                .build();
    }

    public static Template toEntity(TemplateDto dto) {
        return Template.builder()
                .id(dto.getId())
                .name(dto.getName())
                .previewImageUrl(dto.getPreviewImageUrl())
                .description(dto.getDescription())
                .build();
    }
}
