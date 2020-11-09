/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private Integer capacity_;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity_ = capacity;
        this.items = new ArrayList();
    }
    
    @Override
    public void add(Item item) {
        if (this.capacity_ - item.getWeight() >= 0) {
            this.items.add(item);
            this.capacity_ -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }
        
        return false;
    }
    
}
