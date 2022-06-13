package welcomeToJava;
import java.util.*;

public class TwoPointer {
	public static void Two_Pointer(int a[],int n,int i,int j) {
		
		
		  System.out.println(" Now We use Two Point aprocah");
//        0,1,2,3,4 =idx
//        1 2 3 4 5 =ele
        i=0;
        j=n-1;
        while(i<=j)
        {
       	 int temp=a[j];
       	 a[j]=a[i];
       	 a[i]=temp;
       	 i++;
       	 j--;
   
        }
        
        
        
        for( i=0;i<n;i++) {
       	 System.out.print(a[i] + " ");
        }
     
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		i=0;
		while(i<n) {
			a[i]=sc.nextInt();
		i++;
		}

         i=0;
         j=n-1;
         while(i<=j)
         {
        	 System.out.println(a[i]+" "+a[j]);
        	 i++;
        	 j--;
         }
		 Two_Pointer(a,n,i,j);
         
       
         
         
         
         
         
         
         
         
         
         
	}

}
