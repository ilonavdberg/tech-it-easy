package com.tech_it_easy.TechItEasy.repositories;

import com.tech_it_easy.TechItEasy.models.CIModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CIModuleRepository extends JpaRepository<CIModule, Long> {
}
