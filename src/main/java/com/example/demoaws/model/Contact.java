package com.example.demoaws.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Contact {

    private Integer id;

    private String name;

    private LocalDateTime registerTime;

    @PrePersist
    void prePersist(){
        registerTime = LocalDateTime.now();
    }
}
