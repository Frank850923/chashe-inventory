/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.chashe.inventory.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 *
 * @author frvi
 */
@Entity
public class Item {
    @GeneratedValue
    private int id;
    private int price;
    private String name;
    private int amount;
    private String description;
    private List<Integer> quantities;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(List<Integer> quantities) {
        this.quantities = quantities;
    }
    
    
}
