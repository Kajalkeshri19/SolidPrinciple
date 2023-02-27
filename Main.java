/* This code is voilating the Liskov Substitution Principle because the sub class (Square) is changing the functionality of base class (Rectangle). So, to remove this i have created an interface named as Shape which is implemented by both classes Rectangle and Square.*/

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
    Square s = new Square();
    s.setSide(5);
    System.out.println(s.getArea());
  }
  
}
