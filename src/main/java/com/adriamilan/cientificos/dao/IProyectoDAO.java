package com.adriamilan.cientificos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adriamilan.cientificos.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, Long> {

}
