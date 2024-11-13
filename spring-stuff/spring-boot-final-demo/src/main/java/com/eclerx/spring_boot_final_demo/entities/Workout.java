package com.eclerx.spring_boot_final_demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(unique = true)
    String title;
    int cbpm;
    String description;

    public Workout(){

    }
    

    public Workout( String title, int cbpm, String description) {
        this.title = title;
        this.cbpm = cbpm;
        this.description = description;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    Category category;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getCbpm() {
        return cbpm;
    }
    public void setCbpm(int cbpm) {
        this.cbpm = cbpm;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    
    @Override
    public String toString() {
        return "Workout [id=" + id + ", title=" + title + ", cbpm=" + cbpm + ", description=" + description + "]";
    }
  

    
}
