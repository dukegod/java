public class test{
	int x;
	private test(String name){
  	// 这个构造器仅有一个参数：name
 		 System.out.println("Passed Name is :" + name ); 
		}

   public static void main(String []args){
      /* 创建对象 */
      test myPuppy = new test("tommy");
     
      System.out.println("the end");
   }
}






