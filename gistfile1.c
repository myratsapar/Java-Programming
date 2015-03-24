#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
main()
{
   char ch;
 
   printf("Do you want to shutdown your computer now (y/n)\nYou say: ");
   scanf("%c",&ch);
 
   if (ch == 'y' || ch == 'Y')
      system("C:\\WINDOWS\\System32\\shutdown /s");
   else if (ch == 'n' || ch == 'N' )
   printf ("You said 'No', therefore computer won't shut down");
   else
   printf ("You should choose one of these: (y/n)");
      
 	getch ();
    return 0;
}