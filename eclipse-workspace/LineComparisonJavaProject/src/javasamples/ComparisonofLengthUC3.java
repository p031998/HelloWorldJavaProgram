package javasamples;

public class ComparisonofLengthUC3 {
	public static void main(String[] args) {
		int x1=1,x2=4,y1=1,y2=4;
		int a1=1,a2=9,b1=1,b2=9;
		Double length1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		Double length2=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		if(Double.compare(length1,length2)==0) {
			System.out.println("length1 is equal to length2");
		}
		else if(Double.compare(length1,length2)<0) {
			System.out.println("length1 is less than length2");
		}
		else {
			System.out.println("length1 is greater than length2");
		}
	}
			

}
