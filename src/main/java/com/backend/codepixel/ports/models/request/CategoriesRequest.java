package com.backend.codepixel.ports.models.request;

public class CategoriesRequest {

    private String title;
    private String description;

    public CategoriesRequest(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getters et setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


