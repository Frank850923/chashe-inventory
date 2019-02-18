/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.chashe.inventory.boundary;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
import se.chashe.inventory.entity.Item;

/**
 *
 * @author frvi
 */
@Stateless
public class InventoryService {
    
    @PersistenceContext
    private EntityManager em;
    
    public List<Item> getAllItems(){
        return em.createNamedQuery(Item.FIND_ALL, Item.class).getResultList();
    }
    
    public void addItem(@Valid Item item){
        em.persist(item);
    }
    
}
