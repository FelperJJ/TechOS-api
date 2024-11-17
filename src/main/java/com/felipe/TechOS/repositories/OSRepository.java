package com.felipe.TechOS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.TechOS.domain.OS;

@Repository
public interface OSRepository extends JpaRepository<OS, Integer> {

}
