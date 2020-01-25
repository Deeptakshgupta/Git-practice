package pulkit;
//import java.util.*;
public class subtractmat {
public static void main(String[] args) {
	int a[][]= {{2,3,4},
			{7,6,5},
			{8,9,1}};
	int b[][]= {{2,9,8},
			{5,6,7},
			{4,2,3}};
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			//System.out.print(i+""+j+" ");
			System.out.print(b[i][j]-a[i][j]+" ");
		}
		System.out.println();
	}

}
}
