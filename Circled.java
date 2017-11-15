class Circled {

int r;
double perimeter;
double area;
final static double PI = 3.14;

public Circled(int radius){
  r = radius;
  area = PI * r * r;
  perimeter = 2 * PI * r;
};

public static void main(String[] args){
  Circled c1 = new Circled(9);

  System.out.println("Area: " + c1.area);
  System.out.println("Perimeter: " + c1.perimeter);
  }
}//1:24 AM 15-Nov-17