package ru.geekbrains.simplewebapp.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.simplewebapp.dto.ProductDto;
import ru.geekbrains.simplewebapp.entities.Product;
import ru.geekbrains.simplewebapp.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<ProductDto> getProducts() {
        return productsMapper(repo.findAll());
    }

    private List<ProductDto> productsMapper(List<Product> product) {
        return product.stream().map(p -> new ProductDto(p.getId(), p.getCost(), p.getTitle())).collect(Collectors.toList());
    }
}
