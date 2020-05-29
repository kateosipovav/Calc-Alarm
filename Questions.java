
public class Questions {
   int u=(int)(Math.random()*10);
   int l=(int)(Math.random()*20)-10;
   int e=(int)(Math.random()*10)-3;
   int c1=(int)(Math.random()*30)-15;
   int c2=(int)(Math.random()*20)-10;
   int c3=(int)(Math.random()*20)-10;
   int e2=(int)(Math.random()*10)-3;
   public void type1() {
      System.out.println("upper bound:"+u);
      System.out.println("∫");
      System.out.println("Lower bound:"+l);
      System.out.println("intergrand:" + c1 + "x^(" + e + ")+(" + c2 + "x^" + e2 + ")+(" + c3 + ")");
   }
   public void type2() {
      System.out.println("upper bound:"+u);
      System.out.println("∫");
      System.out.println("Lower bound:"+l);
      System.out.println("intergrand:" + "(" + c1 + "x^" + (e-1) + ")" + "/" + "(" + c2 + "x^" + e + ")");
   }
   public void type3() {
      System.out.println("upper bound:"+u);
      System.out.println("∫");
      System.out.println("Lower bound:"+l);
      System.out.println("intergrand:" + c1 + "*" + "-sin(" + c2 + "x^" + e + ")");
   }
   public void type4() {
      System.out.println("upper bound:"+u);
      System.out.println("∫");
      System.out.println("Lower bound:"+l);
      System.out.println("intergrand:" + c1 + "*" + "cos(" + c2 + "x^" + e + ")");
   }
   public double s1() {
      if(u==l) {
         return 0;
      }
      double sc1=c1/e;
      double sc2=c2/e2;
      int sce1=e+1;
      int sce2=e2+1;
      double up1=sc1*(u^sce1);
      double up2=sc2*(u^sce2);
      double up3=u*c3;
      double sumu=up1+up2+up3;
      double lp1=sc1*(l^sce1);
      double lp2=sc2*(l^sce2);
      double lp3=l*c3;
      double suml=lp1+lp2+lp3;
      return sumu-suml;
   }
   public double s2() {
      if(u==l) {
         return 0;
      }
      double sc1=c1/(e*c2);
      double up=c2+u^e;
      double lp=c2+l^e;
      double sum=sc1*Math.log(up)-sc1*Math.log(lp);
      return sum;
   }
   public double s3() {
      if(u==l) {
         return 0;
      }
      double sc1=c1/(e*c2);
      double up=(c2+u^e)/Math.PI;
      double lp=(c2+l^e)/Math.PI;
      double sum=sc1*Math.cos(up)-sc1*Math.cos(lp);
      return sum;
   }
   public double s4() {
      if(u==l) {
         return 0;
      }
      double sc1=c1/(e*c2);
      double up=(c2+u^e)/Math.PI;
      double lp=(c2+l^e)/Math.PI;
      double sum=sc1*Math.sin(up)-sc1*Math.sin(lp);
      return sum;
   }
}
