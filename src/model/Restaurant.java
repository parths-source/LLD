import java.util.*;
class Restaurant{
    int id;
    private String name;
    private String loc;
    private ArrayList<menuitem>menu;
    Restaurant(int id,String name, String loc){
        this.id= id;
        this.name=name;
        this.loc= loc;
    }
    public String getName(){
        return name;
    }
    public String getloc(){
        return loc;
    }
    public void additem(menuitem dish){
        menu.add(dish);
    }
    public ArrayList<menuitem> Menu(){
        return menu;
    }

}
