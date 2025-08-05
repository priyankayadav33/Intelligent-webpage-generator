package com.priyanka.webgen.scraper;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ScholarProfile {
    private String name;
    private String affiliation;
    private String interests;
}
