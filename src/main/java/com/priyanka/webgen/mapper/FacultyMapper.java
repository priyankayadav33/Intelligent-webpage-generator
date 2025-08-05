package com.priyanka.webgen.mapper;

import com.priyanka.webgen.dto.FacultyDto;
import com.priyanka.webgen.model.Faculty;

public class FacultyMapper {

    public static FacultyDto toDto(Faculty faculty) {
    return FacultyDto.builder()
            .name(faculty.getName())
            .designation(faculty.getDesignation())
            .department(faculty.getDepartment())
            .email(faculty.getEmail())
            .scholarUrl(faculty.getScholarUrl())
            .linkedinUrl(faculty.getLinkedinUrl())
            .researchInterests(faculty.getResearchInterests())
            .publications(faculty.getPublications())
            .profileSummary(faculty.getProfileSummary())       // ✅ fixed
            .profileImageUrl(faculty.getProfileImageUrl())     // ✅ fixed
            .build();
}
}
