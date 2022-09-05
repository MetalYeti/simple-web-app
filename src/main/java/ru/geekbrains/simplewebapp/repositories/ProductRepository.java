package ru.geekbrains.simplewebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.simplewebapp.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
