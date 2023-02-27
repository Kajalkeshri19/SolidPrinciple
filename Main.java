/* This code is voilating the Liskov Substitution Principle because the sub class (Square) is changing the functionality of base class (Rectangle). So, to remove this i have created a method void setSide which calls setHeight and setWidth method which is implemented in class Rectangle.*/

class Rectangle{
  int m_width;
  int m_height;

  public void setWidth(int width){
    m_width = width;
  }

  public void setHeight(int height) {
    m_height = height;
  }

  public int getWidth() {
    return m_width;
  }

  public int getHeight() {
    return m_height;
  }

  public int getArea() {
    return m_width * m_height;
  }

}

class Square extends Rectangle {

  public void setSide(int side) {
    setHeight(side);
    setWidth(side);
  }

 
}

public class Main {

  public static void main(String args[]) {
    Square obj = new Square();
    obj.setSide(5);
    System.out.println("Area is:" +obj.getArea());
  }
  
}
