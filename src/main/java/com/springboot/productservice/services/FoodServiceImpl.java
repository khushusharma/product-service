package com.springboot.productservice.services;

import com.springboot.productservice.Pizza;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService{
    List<Pizza> list;

    public FoodServiceImpl() {
        list = new ArrayList<>();
        list.add(new Pizza("margherita","Classic delight with 100% real mozzarella cheese"));
        list.add(new Pizza("farmhouse","Delightful combination of onion, capsicum, tomato & grilled mushroom"));
        list.add(new Pizza("peppy Paneer","Flavorful trio of juicy paneer, crisp capsicum with spicy red paprika"));
        list.add(new Pizza("veg Extravaganza","Black olives, capsicum, onion, grilled mushroom, corn, tomato, jalapeno & extra"));
        list.add(new Pizza("cheese n Corn","A delectable combination of sweet & juicy golden corn"));
        list.add(new Pizza("pepper Barbecue Chicken","Pepper barbecue chicken for that extra zing"));
    }

    @Override
    public List<Pizza> getFood() {
        return list;
    }

    @Override
    public Pizza getFoodDetail(String name) {
        Pizza p = null;
        for(Pizza p1:list)
            if (p1.getName().equals(name)) {
                p = p1;
                break;
            }
        return p;
    }

    @Override
    public Pizza addPizzaDetail(Pizza P) {
        list.add(P);
        return P;
    }

    @Override
    public Pizza updatePizzaDetail(String name, Pizza P) {
//        Pizza p;
        for (Pizza p1:list)
            if(p1.getName().equals(name)){
                p1 = P;
                break;
            }
        return P;
    }

    @Override
    public List<Pizza> deleteProductDetail(String name) {
        for(Pizza p1:list){
            if(p1.getName().equals(name)){
                list.remove(p1);
            }
        }
        return list;
    }
}
