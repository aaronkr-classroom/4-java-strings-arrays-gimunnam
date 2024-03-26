
public class ex603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myGrades = new double[] {
				89.1, 95.0, 87.7, 88.3, 100.0 
		};
		double sum = 0.0;
		double avg = 0.0;
		
		//2차원 배열
		double[][] myClassGrades = new double[][] {
				{89.1, 88.2, 83.2, 85.5, 75.2},
				{95.0, 93.2, 78.2, 65.3, 46.7},
				{87.7, 76.5, 97.5, 76.4, 87.5}, 
				{88.3, 56.6, 67.9, 100.0, 56.5}, 
				{100.0, 99.9, 98.8, 89.9, 46.7} 
		};
		String[] myClasses = new String[] {
				"국어", "수학", "공학", "사회", "pe"
		};
		
		for (int i = 0; i < myClasses.length; i++) {
			System.out.print(myClasses[i] + ":");
			for (int j = 0; j < 5; j++) {
				System.out.print(myClassGrades[i][j] + ", ");
			}
			System.out.println();
		}
		/*
		for (double g : myGrades) {
			sum += g;
		}
		avg = sum / myGrades.length;
		
		System.out.println("합계: " + sum);
		System.out.format("평균: %.2f", avg);
		*/
	}

}
