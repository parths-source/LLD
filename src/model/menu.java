class MenuItem{
    private String name;
    private int price;
    private String imgUrl;
    MenuItem(String name,int price,String imgUrl){
        this.name=name;
        this.price=price;
        this.imgUrl=imgUrl;
    }
    public String getName(){
        return name;
    }
    public String setName(String newName){
        return newName;
    }
    public int getPrice(){
        return price;
    }
    public int setPrice(int newPrice){
        return newPrice;
    }
    public String getImgUrl() {
        return imgUrl;
    }


}