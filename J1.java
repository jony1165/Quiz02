package Quiz;
import java.util.Scanner;
public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, num4;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("密碼輸入測試");
        System.out.println("請輸入密碼：");
        num1 = scanner.nextInt();
        try
	      {
	        if(num1==0)
	         throw new ArithmeticException();    // 拋出例外
	        else
	        	System.out.println("請再輸入一次密碼：");
	            num2 = scanner.nextInt();
	        	  // 若沒有拋出例外，則執行此行
	            if(num2==num1)
	            	throw new ArrayIndexOutOfBoundsException(); 
	            else
	            	System.out.println("與第一次輸入不同");
	                System.out.println("請再輸入一次密碼：");
	            	num3 = scanner.nextInt();
	            	if(num3==num1)
	            		throw new ArrayIndexOutOfBoundsException(); 
	            	else
	            		System.out.println("與第一次輸入不同");
	            	    System.out.println("請再輸入一次密碼：");
	            	    num4 = scanner.nextInt();
	            	    if(num4==num1)
	            	    	throw new ArrayIndexOutOfBoundsException();
	            	    else
	            	    	System.out.println("與第一次輸入不同");
	            	        throw  new  RuntimeException("輸入三次錯誤！程式停止！");
	      }
	      catch(ArithmeticException e)
	      {
	         System.out.println("沒有輸入4位數以上密碼！");
	      }
          catch(ArrayIndexOutOfBoundsException e)
	      {
	         System.out.println("密碼正確");
	      }
	}

}
