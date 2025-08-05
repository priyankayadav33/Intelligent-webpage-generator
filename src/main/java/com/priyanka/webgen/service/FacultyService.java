package com.priyanka.webgen.service;

import com.priyanka.webgen.dto.FacultyDto;

public interface FacultyService {
    FacultyDto getByEmail(String email);
    void saveOrUpdate(FacultyDto dto);
}
