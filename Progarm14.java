
public class Progarm14 {

	public static void main(String[] args) {
		Student[] students = new Student[6];
		students[0] = new Student("Fred Blunt", "111-11-1111", 40, 110);
		students[1] = new Student("Jean Green", "222-22-2222", 80, 280);
		students[2] = new GradStudent("Joan Short", "333-33-3333", 15, 60);
		students[3] = new GradStudent("Jack Jones", "444-44-4444", 30, 108);
		 students[4] = new lawStudent("Mark Adams", "555-55-5555", 20, 70,145 );
	     students[5] = new lawStudent("Anne Sachs", "666-66-6666", 20, 65,150);

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}

	}

}
/*Fred Blunt 111-11-1111 40 2.0 false
Jean Green 222-22-2222 80 3.0 true
Joan Short 333-33-3333 15 4.0 false
Jack Jones 444-44-4444 30 3.0 false
Mark Adams 555-55-5555 20 3.0 false
Anne Sachs 666-66-6666 20 3.0 false
*/