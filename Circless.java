class Circless {

int r;
double perimeter;
double area;
final static double PI = 3.14;

public Circless(int radius){
r = radius;
}

double findarea(){
area = PI * r * r;
return area;
};

double findperimeter(){
perimeter = 2 * PI * r;
return perimeter;
};

public static void main(String[] args){
Circless c = new Circless(9);

System.out.println("Radius: " + c.r);
System.out.println("Area: " + c.findarea());
System.out.println("Perimeter: " + c.findperimeter());
 }
}//11:48 AM 15-Nov-17