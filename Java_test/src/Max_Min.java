
public class Max_Min {
	public static void main(String[] args) {
		int arg[]= {25,12,9,6,88,100,54,26};
		int min,max;
		//��ʼ��
		min=max=arg[0];
		for(int i=0;i<arg.length;i++){
			if(arg[i]>max){
				max=arg[i];
			}
			if(arg[i]<min){
				min=arg[i];
			}
		}
		System.out.println("�������ֵΪ ��"+max);
		System.out.println("������СֵΪ�� "+min);
		
	}
}
