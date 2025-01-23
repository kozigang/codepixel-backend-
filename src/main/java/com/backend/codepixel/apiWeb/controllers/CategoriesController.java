package com.backend.codepixel.apiWeb.controllers;


import com.backend.codepixel.ports.models.request.CategoriesRequest;
import com.backend.codepixel.domain.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    // Récupérer toutes les catégories
    @GetMapping
    public List<CategoriesRequest> getAllCategories() {
        return categoriesService.getAllCategories();
    }
}
