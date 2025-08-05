package com.priyanka.webgen.controller;

import com.priyanka.webgen.dto.FacultyDto;
import com.priyanka.webgen.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/faculty")
@CrossOrigin(origins = "http://localhost:5500", allowCredentials = "true") // Use your frontend's URL

public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    // GET by email from query param
    @GetMapping
    public ResponseEntity<FacultyDto> getProfile(@RequestParam String email) {
        FacultyDto dto = facultyService.getByEmail(email);
        if (dto != null) {
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Save or update profile
    @PostMapping
    public ResponseEntity<String> saveProfile(@RequestBody FacultyDto dto) {
        facultyService.saveOrUpdate(dto);
        return ResponseEntity.ok("Profile updated successfully");
    }
}
