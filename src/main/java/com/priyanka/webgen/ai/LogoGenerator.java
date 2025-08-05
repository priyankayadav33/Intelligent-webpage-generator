package com.priyanka.webgen.ai;

import java.util.HashMap;
import java.util.Map;

public class LogoGenerator {

    private static final Map<String, String> LOGO_SUGGESTIONS = new HashMap<>();

    static {
        LOGO_SUGGESTIONS.put("education", "https://example.com/logos/education.png");
        LOGO_SUGGESTIONS.put("tech", "https://example.com/logos/tech.png");
        LOGO_SUGGESTIONS.put("creative", "https://example.com/logos/creative.png");
        LOGO_SUGGESTIONS.put("minimal", "https://example.com/logos/minimal.png");
        LOGO_SUGGESTIONS.put("default", "https://example.com/logos/default.png");
    }

    // Returns logo URL based on keyword
    public static String suggestLogo(String keyword) {
        return LOGO_SUGGESTIONS.getOrDefault(keyword.toLowerCase(), LOGO_SUGGESTIONS.get("default"));
    }
}
