
public class p49 {

	public static void main(String[] args) {
		int [][]test;
		test =new int[2][5];
		
		test[0][0]=80;
		test[0][1]=60;
		test[0][2]=22;
		test[0][3]=60;
		test[0][4]=75;
		test[1][0]=55;
		test[1][1]=90;
		test[1][2]=21;
		test[1][3]=72;
		
		
		for(int i=0;i<test[1].length;i++) {
			System.out.println("��"+(i+1)+"�ӤH����y���ƬO"+test[0][i]+"��");
			System.out.println("��"+(i+1)+"�ӤH���ƾǤ��ƬO"+test[1][i]+"��");
		}
		
	}

}
