public class ReadingExercise {
	
	public void marks() {
		System.out.println("Please enter your students marks. When finished enter -1.");
		String str;
		int count = 0;
		int mark = 0;
		int distinction = 0;
		int pass = 0;
		int fail = 0;
		int invalid = 0;
		do {
			System.out.print("Please enter the next mark: ");
			str = System.console().readLine();			
			mark = Integer.parseInt(str);
			if (mark != -1) {
				count++;
				if (mark >= 70 && mark <= 100) {
					distinction++;
				} else if (mark >= 50 && mark < 70) {
					pass++;
				} else if (mark >=0 && mark < 50) {
					fail++;
				} else {
					invalid++;
				}
			}
		} while (!str.equals("-1"));
		System.out.println("There were " + count + " marks entered.");
		System.out.println("There were " + distinction + " marks that achieved a distinction.");
		System.out.println("There were " + pass + " marks that achieved a pass.");
		System.out.println("There were " + fail + " marks that failed.");
		System.out.println("You entered " + invalid + " invalid marks.");
	}
	
	public static void main(String[] args) {
		ReadingExercise test = new ReadingExercise();
		test.marks();
	}
}