package com.javatechie.kb.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KATALOG_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Katalog {
    @Id
    private int id;
    private String namaBarang;
    private int stok;
    private double price;
}
