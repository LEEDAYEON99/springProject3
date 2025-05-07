package post;

public class Test1 {

	public static void main(String[] args) {
		String str="210821,강원도,강릉시,강동면,모전리,,,";  // 데이터마다 갯수 제각각
		
		
		String[] datas = new String[8];
		
		String[] array = str.split(",");
		System.out.println(array.length);
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		System.out.println(array[6]);
		System.out.println(array[7]);
		
		/*if(array[5] == null) {
		System.out.println("aa");
	}else {
		System.out.println(array[5]);
	}*/ // 오류남 
	
	}

}
