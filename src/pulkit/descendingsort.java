//Descending sort
package pulkit;
import java.util.*;
public class descendingsort {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[]= {1,2,4,3};
	int i,j,temp;
	for(i=0;i<4;i++) {
		for(j=i;j<4;j++) {
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(i=0;i<4;i++) {
		System.out.println(a[i]);
	}
}
}
