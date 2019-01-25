
public class Jiecheng {
	public static void main(String[] args) {
		int number=5;
		if(number==0||number==1) {
			System.out.print("0或1的阶乘均为"+1);
		}
		else {
//		            此区域可分析各个基本数据类型之间的区别（byte，short,int,long,）
			int i;
			int count=1;
//			
			for(i=1;i<=number;i++){
				count*=i;
				System.out.print(i+"！"+count+"\n");
			}
			System.out.print(number+"的阶乘为"+count);
		}
	}
}
