
package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private int id=0;
    private String name;
    private String loc;
    private ArrayList<MenuItem> menu = new ArrayList<>();

    public Restaurant(int id, String name, String loc) {
        this.id = ++id;
        this.name = name;
        this.loc = loc;
    }

    public String getName() {
        return name;
    }
    public String setNmae(String newName){
        this.name=newName;
        return newName;
    }

    public String getLoc() {
        return loc;
    }

    public void addItem(MenuItem dish) {
        menu.add(dish);
    }

    public List<MenuItem> getMenu() {
        return menu;
    }
}

