package com.springboot.productservice.services;

import java.util.List;
import com.springboot.productservice.Pizza;

public interface FoodService {
    public List<Pizza> getFood();
    public Pizza getFoodDetail(String name);
    public Pizza addPizzaDetail(Pizza P);
    public Pizza updatePizzaDetail(String name,Pizza P);
    public List<Pizza> deleteProductDetail(String name);
}
