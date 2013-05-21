public class Grading {
	public static void main(String[] args) {
		String a[][]=new String[][]{ {"학생1:","1","3","2","4","3","1","3","2","2","1"},
									 {"학생2:","3","2","4","2","2","1","1","3","4","1"},
									 {"학생3:","2","4","3","2","1","2","1","3","3","4"},
									 {"학생4:","2","3","3","1","1","3","2","2","4","4"},
									 {"학생5:","3","1","1","2","4","1","2","3","1","3"} };
		double s[]=new double[a.length];
		double score[]=new double[]{15.3,7.6,16.1,3.2,8.4,11.1,17.2,5,6.1,10};
		char ox[][]=new char[a.length][a[1].length];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}System.out.println();
		
		if(args.length!=10)
			System.out.println("정답의 개수가 맞지 않습니다.");
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length-1; j++){
				if(Integer.parseInt(args[j])==Integer.parseInt(a[i][j+1])){
					s[i]+=score[j];
					ox[i][j]='O';
				}
				else
					ox[i][j]='X';
			}
			System.out.println("학생 "+(i+1)+"의 점수 : "+(s[i])+"점");
			for(int k=0; k<ox[1].length; k++)
				System.out.print(ox[i][k]+" ");
			System.out.println();
		}
//		for(int k=0; k<ox.length; k++){
//			for(int l=0; l<ox[k].length; l++){
//				System.out.print(ox[k][l]+" ");
//			}
//		}
	}
}