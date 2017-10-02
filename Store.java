class Box{
double x;
double y;
double z;
boolean fragile;
short box_code;
}
public class Store{
public static void main(String[] args){

Box box1 = new Box();
Box box2 = new Box();

box1.x = 3.0; box1.y = 4.0; box1.z = 5.0;
box1.fragile = false;
box1.box_code = 0;

box2.x = 5; box2.y = 10; box2.z = 7.5;
box2.fragile = true;
box2.box_code = 1;
System.out.println("box1 volume is : " + (box1.x*box1.y*box1.z));
System.out.println("box1 box code is : " + (box1.box_code));
System.out.println("box1 fragile situation : " + (box1.fragile)); 
System.out.println(" ");
System.out.println("box2 volume is : " + (box2.x*box2.y*box2.z));
System.out.println("box2 box code is : " + (box2.box_code));
System.out.println("box2 fragile situation : " + (box2.fragile));
}
}
