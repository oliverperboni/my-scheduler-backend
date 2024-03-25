package com.scheduler.myscheduler.servicos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Servicos {

    
    @Id
    @SequenceGenerator(
            name = "service_sequence",
            sequenceName ="service_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator =  "service_sequence"
    )
    int id;
    String name;
    int duration;
    float price;

    public Servicos(int id, String name, int duration, float price) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.price = price;
    }

    public Servicos(String name, int duration, float price) {
        this.name = name;
        this.duration = duration;
        this.price = price;
    }

    public Servicos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Service [id=" + id + ", name=" + name + ", duration=" + duration + "]";
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
