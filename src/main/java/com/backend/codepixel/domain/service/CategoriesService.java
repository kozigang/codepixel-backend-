package com.backend.codepixel.domain.service;

import com.backend.codepixel.ports.models.entity.CategoriesEntity;
import com.backend.codepixel.ports.models.request.CategoriesRequest;
import com.backend.codepixel.infra.repositoryJPA.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    public List<CategoriesRequest> getAllCategories() {
        return categoriesRepository.findAllBy();
    }

    public CategoriesEntity getCategoryById(Long id) {
        return categoriesRepository.findById(id).orElse(null);
    }

}
