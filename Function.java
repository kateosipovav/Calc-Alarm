//import QS.Questions;
public class Function {
   public static Questions a=new Questions();
   public int ran;
   Function(){
	   //ran = (int)(Math.random()*4)+1;
	   ran=4;
   }
   public double answer() {
      if(ran==1) 
         return a.s1();
      if(ran==2)
         return a.s2();
      if(ran==3)
         return a.s3();
      if(ran==4)
         return a.s4();
      return 0;
   }
   public void genRandF(){
      if(ran==1)
         a.type1();   
      if(ran==2)
          a.type2();
      if(ran==3)
         a.type3();
      if(ran==4)
         a.type4();
   }
}
