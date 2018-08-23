import java.lang.*;
import java.util.*;
class Main
{
  public static void main(String [] aa)
  {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the no");
    int a=ss.nextInt();
    int c;
    for(c=0;c<=a;c++)
    {
      if(c%2==0)
      {
        System.out.println(c);
      }
    }
    ss.close();
    }
  }
