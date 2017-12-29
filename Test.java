
import java.util.Scanner;
import java.util.Arrays;
/**
打印如下图形（数组，ABCDEFG）：
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
		// 控制行数7行
		for(int i=1;i<=len;i++){
			// 打印空格
			for(int j=1;j<=len-i;j++){
				System.out.print(" ");
			}
			// 打印字母
			for(int k=1;k<=2*i-1;k++){
				System.out.print(cs[i-1]);
			}
			//换行
			System.out.println();
		}
		
	
	}
}