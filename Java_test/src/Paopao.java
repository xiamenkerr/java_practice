
public class Paopao {
	public static void main(String[] args) {
		int[] age={2,5,1,9,12,6,3,8};
		int i,j,temp;
		for(i=0;i<age.length;i++) {
			for(j=0;j<=i;j++) {
				if(age[i]>age[j]) {
					temp=age[i];
					age[i]=age[j];
					age[j]=temp;
				}
//				System.out.println(age[i]+"..."+age[j]);
			}
			
			
		}
		System.out.print("≈≈–Ú∫Û «"+"\n");
		for(int s=0;s<age.length;s++) {
			System.out.println(age[s]);	
		}	
/*		System.out.println(age[i]);*/
	}
}
