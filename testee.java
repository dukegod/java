public class testee{  
   int i;  
   public void increment(testee t){  
       t.i++;  
       System.out.println(i);   //输出为1  
   }  
   public static void main(String[] args){  
       testee t = new testee();  
       t.increment(t);  
       System.out.println(t.i); //输出也为1  
   }  
}  