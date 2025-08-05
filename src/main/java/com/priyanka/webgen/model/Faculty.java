package com.priyanka.webgen.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String designation;
    private String department;
    private String email;
    private String scholarUrl;
    private String linkedinUrl;
    private String researchInterests;
    private String publications;

    // ✅ Add these missing fields
    private String profileSummary;
    private String profileImageUrl;
}
