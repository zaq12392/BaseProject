package com.git.zaq12392;
import java.util.Scanner;
import java.util.Random;

public class Main {

  private static Scanner scanner;

  public static void main(String[] args) {

    scanner = new Scanner(System.in);

    Shop[] data = Shop.getShops();
    while (true) {
      System.out.println("想吃甚麼?");
      System.out.println("1.東南亞菜 2.台菜 3.日式料理 4.美式料理 5.義大利料理");
      int input = scanner.nextInt();
      int chooseFood = 0;
      while(true) {
        System.out.println("轉盤:\n");
        Random ran = new Random();
        switch (input) {
        case 1:
          System.out.println(data[0].getName() + "\n" + data[1].getName());
          chooseFood = ran.nextInt(2);// 0-1
          break;
        case 2:
          System.out.println(data[2].getName() + "\n" + data[3].getName());
          chooseFood = ran.nextInt(2) + 2;// 2-3
          break;
        case 3:
          System.out.println(data[4].getName() + "\n" + data[5].getName());
          chooseFood = ran.nextInt(2) + 4;// 4-5
          break;
        case 4:
          System.out.println(data[6].getName() + "\n" + data[7].getName());
          chooseFood = ran.nextInt(2) + 6;// 6-7
          break;
        case 5:
          System.out.println(data[8].getName() + "\n" + data[9].getName());
          chooseFood = ran.nextInt(2) + 8;// 8-9
          break;
        }
        System.out.println("按下抽選扭? 1.按 2.不按");
        if(scanner.nextInt()==2){
          continue;
        }
        System.out.println("\n抽選結果:"+ data[chooseFood].getName() + "\n");
        System.out.println("要詳細資料嗎?");
        System.out.println("1.要 2.不要");
        if(scanner.nextInt() == 1) {
          System.out.print(data[chooseFood]);
        }
        System.out.println("這間可以嗎?");
        System.out.println("1.滿意 2.重新選擇");
        if(scanner.nextInt() == 1) {
          break;
        } else {
          input += ran.nextInt(3);
          if(input>5) {
            input -= 5;
          }
        }
      }
      
      System.out.println("1.評分 2.不評分");
      input = scanner.nextInt();
      if (input == 1) {
        System.out.println("請輸入 1.差 2.中 3.好");
        data[chooseFood].setPoint(scanner.nextInt());
        System.out.println("評分成功!\n\n");
      }

    }
  }
}