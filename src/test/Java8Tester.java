package test;

public class Java8Tester {
	   public static void main(String args[]){
	      Java8Tester tester = new Java8Tester();
	        
	      // ��������
	      MathOperation addition = (int a, int b) -> a + b;
	        
	      // ������������
	      MathOperation subtraction = (a, b) -> a - b;
	        
	      // �������еķ������
	      MathOperation multiplication = (int a, int b) -> {  return a * b;};
	        
	      // û�д����ż��������
	      MathOperation division = (int a, int b) -> a / b;
	      
	      int a = 10 ; 
	      a = 90;
	      
	      System.out.println("10 + 5 = " + tester.operate(a, 5, addition));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
	        
	      // ��������
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
	        
	      // ������
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
	        
	      String not = "test";
	     
	      
	      
	      foo just = (str) -> {System.out.println(str);return "success";};
	      
	      greetService1.sayMessage(not);
	      
	      not  = not.substring(0, 1);	     
	      
	      just.just(not);
	      
	     
	      greetService2.sayMessage(not);
	   }
	    
	   interface foo {
		// TODO Auto-generated method stub
		    String just(String str);
		
	}

	interface MathOperation {
	      int operation(int a, int b);
	   }
	    
	   interface GreetingService {
	      void sayMessage(String message);
	   }
	    
	   private int operate(int a, int b, MathOperation mathOperation){
	      return mathOperation.operation(a, b);
	   }
	}