import java.util.Scanner;

public class threeFour {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int anew[]=new int[n];
		for(int i=0;i<n;i++) {
			if(a[i]==3) {
				
				for(int j=0;j<n;j++) {
					if(a[j]==4) {
						int temp=a[i+1];
						a[i+1]=a[j];
						a[j]=temp;
					}
				}
			}
		}
			
		for(int i=0;i<n;i++) {
			System.out.print(anew[i]+" ");
		}
	}

}
