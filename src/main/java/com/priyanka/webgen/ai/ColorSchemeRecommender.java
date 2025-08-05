package com.priyanka.webgen.ai;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColorSchemeRecommender {

    // Example hardcoded recommendation logic
    private static final Map<String, List<String>> SCHEMES = new HashMap<>();

    static {
        SCHEMES.put("academic", List.of("#003366", "#FFFFFF", "#CCCCCC")); // Navy, White, Gray
        SCHEMES.put("creative", List.of("#FF6F61", "#F7CAC9", "#92A8D1")); // Coral, Pink, Light Blue
        SCHEMES.put("tech", List.of("#0F2027", "#203A43", "#2C5364"));     // Dark gradients
        SCHEMES.put("minimal", List.of("#FFFFFF", "#000000", "#F4F4F4"));  // White, Black, Light Gray
        SCHEMES.put("modern", List.of("#4CAF50", "#212121", "#FAFAFA"));   // Green, Dark, Light
    }

    public static List<String> recommendScheme(String type) {
        return SCHEMES.getOrDefault(type.toLowerCase(), SCHEMES.get("modern"));
    }
}
