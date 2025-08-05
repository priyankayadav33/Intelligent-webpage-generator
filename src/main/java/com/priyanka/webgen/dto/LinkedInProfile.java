package com.priyanka.webgen.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LinkedInProfile {
    private String name;
    private String headline;
    private String location;
}
