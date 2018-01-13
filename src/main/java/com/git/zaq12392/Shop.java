package com.git.zaq12392;

public class Shop{
    private int point;
    private String name;
    private String typeString;
    private int type;
    private String location;
    private int phone;



  /**
  * Default empty Shop constructor
  */
  public Shop() {
    super();
        this.point = -1;
        this.name = "N/A";
        this.typeString = "N/A";
        this.type = 0;
        this.location = "N/A";
        this.phone = 0;
  }

  /**
  * Default Shop constructor
  */
  public Shop(int point, String name, String typeString, int type, String location, int phone) {
    super();
    this.point = point;
    this.name = name;
    this.typeString = typeString;
    this.type = type;
    this.location = location;
    this.phone = phone;
  }

  /**
  * Returns value of point
  * @return
  */
  public int getPoint() {
    return point;
  }

  /**
  * Sets new value of point
  * @param
  */
  public void setPoint(int point) {
    this.point = point;
  }

  /**
  * Returns value of name
  * @return
  */
  public String getName() {
    return name;
  }

  /**
  * Sets new value of name
  * @param
  */
  public void setName(String name) {
    this.name = name;
  }

  /**
  * Returns value of typeString
  * @return
  */
  public String getTypeString() {
    return typeString;
  }

  /**
  * Sets new value of typeString
  * @param
  */
  public void setTypeString(String typeString) {
    this.typeString = typeString;
  }

  /**
  * Returns value of type
  * @return
  */
  public int getType() {
    return type;
  }

  /**
  * Sets new value of type
  * @param
  */
  public void setType(int type) {
    this.type = type;
  }

  /**
  * Returns value of location
  * @return
  */
  public String getLocation() {
    return location;
  }

  /**
  * Sets new value of location
  * @param
  */
  public void setLocation(String location) {
    this.location = location;
  }

  /**
  * Returns value of phone
  * @return
  */
  public int getPhone() {
    return phone;
  }

  /**
  * Sets new value of phone
  * @param
  */
  public void setPhone(int phone) {
    this.phone = phone;
  }



  /**
  * Create string representation of Shop for printing
  * @return
  */
  public String toString() {
        
        if(this.point >= 0){
            String record = "好";
            if(point == 3) {
              record = "好";
            }else if(point == 2) {
              record = "中";
            }else {
              record = "差";
            }
            return "商家名字：" + name + "\n" +
                   "商家類別：" + typeString + "\n" +
                   "商家位置：" + location + "\n" +
                   "商家電話：04-" + phone + "\n" +
                   "商家評分：" + record + "\n\n";
        }else{
            return "商家名字：" + name + "\n"+
                   "商家類別： " + typeString + "\n" +
                   "商家位置：" + location + "\n" +
                   "商家電話：04-" + phone + "\n\n";
                   
        }
  }
  
 




    // 0 ： 馬
    // 1 ： 台
    // 2 ： 日
    // 3 ： 美
    // 4 ： 義

    public static Shop[] getShops(){

        Shop[] Data = new Shop[10];

        Data[0] = new Shop(-1, "南香", "東南亞菜", 0, "逢甲路20巷28弄9號",24521828);
        Data[1] = new Shop(-1, "瓦城泰國料理", "東南亞菜", 0, "台灣大道三段301號", 22521733);
        Data[2] = new Shop(-1, "太祖飲食館", "台菜" , 1, "福上巷214弄", 24524563);
        Data[3] = new Shop(-1, "擄胃專家", "台菜", 1, "文華路127巷22號", 24519878);
        Data[4] = new Shop(-1, "三次魚屋", "日式料理", 2, "河南路二段255之1號", 24517808);
        Data[5] = new Shop(-1, "滿燒肉丼食堂", "日式料理", 2, "文華路100號", 24528618);
        Data[6] = new Shop(-1, "麥味登", "美式料理", 3, "逢大路113號", 24523123);
        Data[7] = new Shop(-1, "麥當勞", "美式料理", 3, "福星路427號", 24513592);
        Data[8] = new Shop(-1, "OHLALA", "義大利料理", 4, "文華路179號", 27081200);
        Data[9] = new Shop(-1, "隨義煮", "義大利料理", 4, "西安街183號", 24523023);

        return Data;
    }


}