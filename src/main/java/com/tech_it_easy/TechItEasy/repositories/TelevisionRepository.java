package com.tech_it_easy.TechItEasy.repositories;

import com.tech_it_easy.TechItEasy.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelevisionRepository extends JpaRepository<Television, Long> {
}
