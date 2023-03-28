package com.springboot.productservice;

import com.springboot.productservice.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private FoodService food;
    @GetMapping("/food")
    public List<Pizza> getAllPizza(){
        return food.getFood();
    }

    @GetMapping("/food/{name}")
    public Pizza getPizza(@PathVariable String name){
        return food.getFoodDetail(name);
    }

    @PostMapping("/food")
    public Pizza addPizza(@RequestBody Pizza P){
        return food.addPizzaDetail(P);
    }
    @PutMapping("/food/{name}")
    public Pizza updatePizza(@PathVariable String name,@RequestBody Pizza P){
        return new ResponseEntity<>(food.updatePizzaDetail(name,P),HttpStatus.OK).getBody();
        // return new ResponseEntity<>(productService.updateProduct(productDto,id), HttpStatus.OK);
        //return ResponseEntity<>(food.updatePizzaDetail(name,P), HttpStatus.OK);
    }

    @DeleteMapping("/food/{name}")
    public List<Pizza> deleteProduct(@PathVariable String name){
        return new ResponseEntity<>(food.deleteProductDetail(name),HttpStatus.OK).getBody();
       // return null;
    }
//    @GetMapping("/{name}")
//    public Pizza getPizzaDetail(@PathVariable("name") String name,String desc){
//        return new Pizza(name,desc);
//    }

}
