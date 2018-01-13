package com.git.zaq12392;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class ShopTest {
  @Test
  public void getName() {
    Shop shop = new Shop(-1, "南香", "東南亞菜", 0, "逢甲路20巷28弄9號", 24521828);
    String result = shop.getName();
    Assert.assertEquals("南香", result);
  }
  @Test
  public void buildShop() {
    Shop shop = new Shop();
  }
  @Test
  public void buildShopWithData() {
    Shop shop = new Shop(-1, "南香", "東南亞菜", 0, "逢甲路20巷28弄9號", 24521828);
  }
  @Test
  public void setPoint() {
    Shop shop = new Shop();
    shop.setPoint(0);
  }
  @Test
  public void TesttoString(){
    //尚未評分
    Shop shop = new Shop(-1, "南香", "東南亞菜", 0, "逢甲路20巷28弄9號",24521828);
    Assert.assertEquals( "商家名字：" + "南香" + "\n"+
        "商家類別： " + "東南亞菜" + "\n" +
        "商家位置：" + "逢甲路20巷28弄9號" + "\n" +
        "商家電話：04-" + "24521828" + "\n\n",shop.toString());
    //評分 差
    shop.setPoint(1);
    Assert.assertEquals( "商家名字：" + "南香" + "\n" +
        "商家類別：" + "東南亞菜" + "\n" +
        "商家位置：" + "逢甲路20巷28弄9號" + "\n" +
        "商家電話：04-" + "24521828" + "\n" +
        "商家評分：" + "差" + "\n\n",shop.toString());
    //評分 中
    shop.setPoint(2);
    Assert.assertEquals( "商家名字：" + "南香" + "\n" +
        "商家類別：" + "東南亞菜" + "\n" +
        "商家位置：" + "逢甲路20巷28弄9號" + "\n" +
        "商家電話：04-" + "24521828" + "\n" +
        "商家評分：" + "中" + "\n\n",shop.toString());
    //評分 好
    shop.setPoint(3);
    Assert.assertEquals( "商家名字：" + "南香" + "\n" +
        "商家類別：" + "東南亞菜" + "\n" +
        "商家位置：" + "逢甲路20巷28弄9號" + "\n" +
        "商家電話：04-" + "24521828" + "\n" +
        "商家評分：" + "好" + "\n\n",shop.toString());
  }
  @Test
  public void getShop(){
    Shop[] data = Shop.getShops();
  }
}
