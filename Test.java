
import java.util.Scanner;
import java.util.Arrays;
/**
��ӡ����ͼ�Σ����飬ABCDEFG����
	  A
	 BBB
	CCCCC
   DDDDDDD
  EEEEEEEEE
 FFFFFFFFFFF
GGGGGGGGGGGGG
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		char[] cs = {'A','B','C','D','E','F','G'};
		int len = cs.length;
		// ��������7��
		for(int i=1;i<=len;i++){
			// ��ӡ�ո�
			for(int j=1;j<=len-i;j++){
				System.out.print(" ");
			}
			// ��ӡ��ĸ
			for(int k=1;k<=2*i-1;k++){
				System.out.print(cs[i-1]);
			}
			//����
			System.out.println();
		}
		
	
	}
}