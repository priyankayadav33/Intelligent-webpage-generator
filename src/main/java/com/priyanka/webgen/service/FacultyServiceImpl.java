package com.priyanka.webgen.service;

import com.priyanka.webgen.dto.FacultyDto;
import com.priyanka.webgen.mapper.FacultyMapper;
import com.priyanka.webgen.model.Faculty;
import com.priyanka.webgen.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    @Override
    public FacultyDto getByEmail(String email) {
        Optional<Faculty> optionalFaculty = facultyRepository.findByEmail(email);
        if (optionalFaculty.isEmpty()) {
            throw new RuntimeException("Faculty not found with email: " + email);
        }
        return FacultyMapper.toDto(optionalFaculty.get());
    }

    @Override
public void saveOrUpdate(FacultyDto dto) {
    Faculty faculty = facultyRepository.findByEmail(dto.getEmail()).orElse(new Faculty());

    // Set all fields
    faculty.setEmail(dto.getEmail());
    faculty.setName(dto.getName());
    faculty.setDesignation(dto.getDesignation());
    faculty.setDepartment(dto.getDepartment());
    faculty.setScholarUrl(dto.getScholarUrl());
    faculty.setLinkedinUrl(dto.getLinkedinUrl());
    faculty.setResearchInterests(dto.getResearchInterests());
    faculty.setPublications(dto.getPublications());
    faculty.setProfileSummary(dto.getProfileSummary());
    faculty.setProfileImageUrl(dto.getProfileImageUrl());

    facultyRepository.save(faculty);
}

}
