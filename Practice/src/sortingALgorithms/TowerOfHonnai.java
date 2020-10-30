package sortingALgorithms;

public class TowerOfHonnai {

	public static void main(String[] args) {
		move(5,1,3);

	}

	public static void move(int n, int start, int end) {
		if(n==0)
			return;
		int inter = 6-start-end;
		move(n-1,start,inter);
		System.out.println("Disk "+n+" moved from "+start+" to "+end);
		move(n-1,inter,end);
	}

}
