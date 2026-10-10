import java.util.*;

class Restaurant{
    int id;
    private String name;
    private String loc;
    private ArrayList<MenuItem>menu;
    Restaurant(int id,String name, String loc){
        this.id= id;
        this.name=name;
        this.loc= loc;
    }
    public String getName(){
        return name;
    }
    public String getLoc(){
        return loc;
    }
    public void addItem(MenuItem dish){
        menu.add(dish);
    }
    public ArrayList<MenuItem> Menu(){
        return menu;
    }

}
