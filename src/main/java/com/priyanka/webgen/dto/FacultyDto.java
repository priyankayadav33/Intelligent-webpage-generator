package com.priyanka.webgen.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FacultyDto {
    private String name;
    private String designation;
    private String department;
    private String email;
    private String scholarUrl;
    private String linkedinUrl;
    private String researchInterests;
    private String publications;

    // ✅ Add missing fields below
    private String profileSummary;
    private String profileImageUrl;
}
