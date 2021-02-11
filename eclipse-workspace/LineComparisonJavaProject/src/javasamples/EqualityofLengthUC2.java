package javasamples;

public class EqualityofLengthUC2 {
	public static void main(String[] args) {
		int x1=1,x2=4,y1=1,y2=4;
		int a1=1,a2=9,b1=1,b2=9;
		Double length1=new Double(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
		Double length2=new Double(Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1)));
		if(length1.equals(length2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
			
		
		
	}


}
