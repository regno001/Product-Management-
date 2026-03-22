
package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(length = 1000)
    private String desc;

    private String brand;

    private BigDecimal price;

    private String category;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    private boolean available;

    private int stockQuantity;

    private String imageName;

    private String imageType;

    @Lob
    private byte[] imageData;
}