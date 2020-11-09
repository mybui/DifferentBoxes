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

public class OneItemBox extends Box {
    
    private Integer capacity_;
    private ArrayList<Item> items;
    
    public OneItemBox() {
        this.capacity_ = 1;
        this.items = new ArrayList();
    }
    
    @Override
    public void add(Item item) {
        if (this.items.isEmpty()) {
            this.items.add(item);
            this.capacity_ = 0;
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
