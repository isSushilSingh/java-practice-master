class CTriangleASum{
	static void triangleASum(int x[][]){
		for(int i=0;i<x.length;i++)
			if(x.length!=x[i].length)
				return;
		int sum=0;
		for(int i=0;i<x.length;i++)
			for(int j=i;j<x[0].length;j++)
				sum+=x[i][j];
		System.out.println(sum);
	}public static void main(String... args){
		triangleASum(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
	}
}