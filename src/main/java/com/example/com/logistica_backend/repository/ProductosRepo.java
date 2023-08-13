package com.example.com.logistica_backend.repository;

import com.example.com.logistica_backend.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepo extends JpaRepository<Productos, Long> {
}
