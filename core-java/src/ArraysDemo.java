import java.util.Arrays;
import java.util.Iterator;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] ar= {10,20,30,40,50};
		for(int i=0;i<ar.length;i++) 
			System.out.println(ar[i]);
		 for(int i:ar)
			 System.out.println(i);
		 
		 int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		 for(int i=0;i<mat.length;i++)
		 {
			 for(int j=0;j<mat[i].length;j++)
			 {
				 System.out.print(mat[i][j]+"\t");
			 }
			 System.out.println();
		 }
		 int[] star= {30,22,18,15,5};
		 Arrays.sort(star);
		  System.out.printf("sorted array[]: %s", Arrays.toString(star));
		  
		  int temp=0;
		  
		  for(int i=0;i<star.length;i++)
		  {
			  System.out.println(star[i]+" ");
		  }
		  for(int i=0;i<star.length;i++) {
			  for(int j=i+1;j<star.length;j++)
			  {
				  if(star[i]>star[j]) {
					  temp=star[i];
					  star[i]=star[j];
					  star[j]=temp;
				  }
			  }
		  }
		  System.out.println();
}
}
