import java.util.Scanner;
public class Askisi2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		double averageGrades;
		double zGrade;
		double cGrade;
		int zAssignment;
		int cAssignment;

		System.out.println("M.O. mathimatwn:");
		averageGrades = input.nextDouble();
		System.out.println("Mathima z:");
		zGrade = input.nextDouble();
		System.out.println("Mathima c:");
		cGrade = input.nextDouble();
		System.out.println("Ergasia Mathima z: //An 'NAI' patiste 1, An 'OXI' patiste 0");
		zAssignment = input.nextInt();
		System.out.println("Ergasia Mathima c: //An 'NAI' patiste 1, An 'OXI' patiste 0");
		cAssignment = input.nextInt();

		if(averageGrades>8 && (zGrade+cGrade)/2>=8.5)
			System.out.println("Tha dothei Systatiki Epistoli");
		else if (averageGrades>8.5 && (zAssignment==1 || cAssignment==1 ))
			System.out.println("Tha dothei Systatiki Epistoli");
		else
			System.out.println("Den tha dothei Systatiki Epistoli");

	}
}