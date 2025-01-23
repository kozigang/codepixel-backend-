package com.backend.codepixel.ports.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class CategoriesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 20)
    private String title;

    @Column(name = "description", length = 100)
    private String description;

    @Column(name = "date_creation", nullable = false)
    private Timestamp dateCreation;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Timestamp getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Timestamp dateCreation) {
        this.dateCreation = dateCreation;
    }

    // Constructor
    public CategoriesEntity() {
    }

    public CategoriesEntity(Integer id, String title, String description, Timestamp dateCreation) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateCreation = dateCreation;
    }
}
