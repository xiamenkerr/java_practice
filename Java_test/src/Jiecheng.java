
public class Jiecheng {
	public static void main(String[] args) {
		int number=5;
		if(number==0||number==1) {
			System.out.print("0��1�Ľ׳˾�Ϊ"+1);
		}
		else {
//		            ������ɷ�������������������֮�������byte��short,int,long,��
			int i;
			int count=1;
//			
			for(i=1;i<=number;i++){
				count*=i;
				System.out.print(i+"��"+count+"\n");
			}
			System.out.print(number+"�Ľ׳�Ϊ"+count);
		}
	}
}
