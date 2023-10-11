import java.util.*
class continent
{
  public String c1;
  continent(String c1)
  {
     this.c1=c1;
  }
}
class country extends continent
{
  String c2;
  country(String c1,String c2)
  {
     super(c1);
     this.c2=c2;
  }
}
class state extends country
{
  String c2;
  state(String c1,String c2,String st)
  {
     super(c1,c2);
     this.st=st;
  }
}
class place extends state
{
  String pl;
  place(String c1,String c2,String st)
  {
     super(c1,c2,st);
     this.pl=pl;
  }
}
class setA1
{
  public static void main(String args[])
  {
    place p=new place("asia","bharat","maharshtra","nashik");
    System.out.println("continent:"+p.c1);
    System.out.println("country:"+p.c2);
    System.out.println("state:"+p.st);
    System.out.println("place:"+p.cpl);
  }
}

/*
OUTPUT:-
continent:asia
country:bharat
state:maharshtra
place:nashik
*/
