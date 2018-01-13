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
            String record = "�n";
            if(point == 3) {
              record = "�n";
            }else if(point == 2) {
              record = "��";
            }else {
              record = "�t";
            }
            return "�Ӯa�W�r�G" + name + "\n" +
                   "�Ӯa���O�G" + typeString + "\n" +
                   "�Ӯa��m�G" + location + "\n" +
                   "�Ӯa�q�ܡG04-" + phone + "\n" +
                   "�Ӯa�����G" + record + "\n\n";
        }else{
            return "�Ӯa�W�r�G" + name + "\n"+
                   "�Ӯa���O�G " + typeString + "\n" +
                   "�Ӯa��m�G" + location + "\n" +
                   "�Ӯa�q�ܡG04-" + phone + "\n\n";
                   
        }
  }
  
 




    // 0 �G ��
    // 1 �G �x
    // 2 �G ��
    // 3 �G ��
    // 4 �G �q

    public static Shop[] getShops(){

        Shop[] Data = new Shop[10];

        Data[0] = new Shop(-1, "�n��", "�F�n�ȵ�", 0, "�{�Ҹ�20��28��9��",24521828);
        Data[1] = new Shop(-1, "�˫�����Ʋz", "�F�n�ȵ�", 0, "�x�W�j�D�T�q301��", 22521733);
        Data[2] = new Shop(-1, "�ӯ������]", "�x��" , 1, "�֤W��214��", 24524563);
        Data[3] = new Shop(-1, "�ۭG�M�a", "�x��", 1, "��ظ�127��22��", 24519878);
        Data[4] = new Shop(-1, "�T������", "�馡�Ʋz", 2, "�e�n���G�q255��1��", 24517808);
        Data[5] = new Shop(-1, "���N���d����", "�馡�Ʋz", 2, "��ظ�100��", 24528618);
        Data[6] = new Shop(-1, "�����n", "�����Ʋz", 3, "�{�j��113��", 24523123);
        Data[7] = new Shop(-1, "�����", "�����Ʋz", 3, "�֬P��427��", 24513592);
        Data[8] = new Shop(-1, "OHLALA", "�q�j�Q�Ʋz", 4, "��ظ�179��", 27081200);
        Data[9] = new Shop(-1, "�H�q�N", "�q�j�Q�Ʋz", 4, "��w��183��", 24523023);

        return Data;
    }


}
