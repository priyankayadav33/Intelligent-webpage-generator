package com.priyanka.webgen.repository;

import com.priyanka.webgen.model.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Long> {

    // You can define custom query methods here if needed
    // For example:
    // List<Template> findByIndustry(String industry);
}
