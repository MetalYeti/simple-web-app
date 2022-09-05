package ru.geekbrains.simplewebapp.dto;

import java.math.BigDecimal;

public class ProductDto {
    private Long id;
    private BigDecimal cost;
    private String title;

    public ProductDto(Long id, BigDecimal cost, String title) {
        this.id = id;
        this.cost = cost;
        this.title = title;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
