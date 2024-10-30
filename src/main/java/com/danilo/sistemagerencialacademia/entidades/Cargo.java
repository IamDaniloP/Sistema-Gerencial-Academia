package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cargo")
@Data
public class Cargo {
    @Id
    @Column(name = "cargo_id")
    private Integer id;

    @Column(name = "cargo", nullable = false)
    private String cargo;
}
