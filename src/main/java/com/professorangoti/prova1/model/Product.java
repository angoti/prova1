package com.professorangoti.prova1.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private String description;
    private Integer price;
    private LocalDate availableFrom;
}
