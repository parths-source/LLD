package model;
import model.Restaurant;
import java.util.ArrayList;
import java.util.List;

class cart{
  private Restaurant R;
  ArrayList<MenuItem>yourCart;
  cart(Restaurant R){
      this.R=R;
      this.yourCart=yourCart;
  }
  public Restaurant getRestaurant(){
      return R;
  }
  public void addToCart(MenuItem item){
      yourCart.add(item);
  }
  public int totalCost(){
      int total=0;
      for(MenuItem curr:yourCart){
          total+=curr.getPrice();
      }
      return total;
  }
  public void clearCart(){
      yourCart.clear();
  }
  public void deleteitem(MenuItem del){
      for(MenuItem curr:yourCart){
          if(del==curr) curr.delete();

      }
  }

}
