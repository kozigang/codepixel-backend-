package com.backend.codepixel.infra.repositoryJPA;

import com.backend.codepixel.ports.models.entity.CategoriesEntity;
import com.backend.codepixel.ports.models.request.CategoriesRequest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<CategoriesEntity, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
    List<CategoriesRequest> findAllBy();
}
