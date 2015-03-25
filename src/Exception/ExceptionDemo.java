package Exception;

public class ExceptionDemo {
	
	public static void main(String[] agrs){
		try{
			Long l1 = createNumber("");
			System.out.println(l1);
		}catch(NumberFormatException e){
			System.out.println("Error NumberFormatException");
		}catch(Exception e){
			System.out.println("Error Exception: "+e.getMessage());
		}finally{
			System.out.println("Finish");
		}
	}
	
	private static Long createNumber(String str) throws Exception{
		
		if("".equals(str)){
			throw new Exception();
//			throw new IllegalArgumentException();
		}
		
		return new Long(str);
	}

}
