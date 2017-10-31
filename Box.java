public class Box{
double x, y, z;

public static class Calculation1{
public static double Volume1(double a, double b, double c){
return(a*b*c);
}
}

public static class Calculation2{
public double Volume2(Box m){
return(m.x*m.y*m.z);
}
}
public static void main(String[] args){
Box k = new Box(); 
double v1, v2;

k.x = 5.0;
k.y = 6.0;
k.z = 4.0;

v1 = Calculation1.Volume1(k.x, k.y, k.z);
Calculation2 n = new Calculation2();
v2 = n.Volume2(k);
System.out.println("Calculation1: " + v1 + " Calculation 2 : " + v2);
}
}