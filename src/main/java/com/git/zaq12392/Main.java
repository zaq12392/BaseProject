package com.git.zaq12392;
import java.util.Scanner;
import java.util.Random;

public class Main {

  private static Scanner scanner;

  public static void main(String[] args) {

    scanner = new Scanner(System.in);

    Shop[] data = Shop.getShops();
    while (true) {
      System.out.println("�Q�Y�ƻ�?");
      System.out.println("1.�F�n�ȵ� 2.�x�� 3.�馡�Ʋz 4.�����Ʋz 5.�q�j�Q�Ʋz");
      int input = scanner.nextInt();
      int chooseFood = 0;
      while(true) {
        System.out.println("��L:\n");
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
        System.out.println("\n��ﵲ�G:"+ data[chooseFood].getName() + "\n");
        System.out.println("�n�ԲӸ�ƶ�?");
        System.out.println("1.�n 2.���n");
        if(scanner.nextInt() == 1) {
          System.out.print(data[chooseFood]);
        }
        System.out.println("�o���i�H��?");
        System.out.println("1.���N 2.���s���");
        if(scanner.nextInt() == 1) {
          break;
        } else {
          input += ran.nextInt(3);
          if(input>5) {
            input -= 5;
          }
        }
      }
      
      System.out.println("1.���� 2.������");
      input = scanner.nextInt();
      if (input == 1) {
        System.out.println("�п�J 1.�t 2.�� 3.�n");
        data[chooseFood].setPoint(scanner.nextInt());
        System.out.println("�������\!\n\n");
      }

    }
  }
}
