package com.adriamilan.cientificos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adriamilan.cientificos.dto.Cientifico;

public interface ICientificoDAO extends JpaRepository<Cientifico, Long> {

}
