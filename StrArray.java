public class StrArray{
public static void main(String[] args){

String arr [][]= {
  {"Let", "Me"}, 
  {"Drop", "Everything"},
  {"And", "Work", "On"},
  {"Your", "Problem"}
};

for (int i = 0; i < arr.length; i++){
   for (int j = 0; j < arr[i].length; j++){
   System.out.print(" " + arr[i][j]);
   }
System.out.println("");
  }
 }
}//10:51 AM 15-Nov-17