

public class EvenEx {

	public static void main(String[] args) {
		int []x = { 7,20,12,13,26,26,8};
		
		//x = new int[4] ;
		
		/*x[0] = 23;
		x[1] = 7;
		x[2] = 14;
		x[3] = 1 ;
		*/
		
	int l=	x.length ;
	int s;
	s = 0 ;
	
	
	
	for(int i=0; i<l ; i =i+1) {
		
		if(x[i]%2==0 && i%2==0) {
			System.out.println(x[i]);
			//System.out.println(i);
			
			
		
		
		s = s+ x[i];
		}
		
	}
	System.out.println(s);

	}

}
