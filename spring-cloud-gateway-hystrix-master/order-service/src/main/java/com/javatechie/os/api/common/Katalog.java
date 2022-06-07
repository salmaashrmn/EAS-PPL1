package com.javatechie.os.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Katalog {

    private int id;
    private String namaBarang;
    private int stok;
    private double price;
}
