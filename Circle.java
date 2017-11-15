class Circle{

static int r;
static double perimeter;
static double area;
final static double PI = 3.14;

public static void main(String[] args){

Circle c = new Circle();
c.r = 7;
c.perimeter = PI * c.r * c.r;
c.area = 2 * PI * c.r;

System.out.println("Radius: " + c.r);
System.out.println("Perimeter: " + c.perimeter);
System.out.println("Area: " + c.area);


Circle cd = new Circle();

cd.r = 4;
cd.perimeter = PI * cd.r * cd.r;
cd.area = 2 * PI * cd.r;

System.out.println("Radius: " + cd.r);
System.out.println("Perimeter: " + cd.perimeter);
System.out.println("Area: " + cd.area);
  }
}//12:54 AM 15-Nov-17