package StudentDB;

public abstract class Student {

	private int studentId;
	private String firstName;
	private String lastName;
	private String gpa;
	private String status;
	private String mentor;

	public void getStudentId() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param studentId
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void getFirstName() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(int firstName) {
		this.firstName = firstName;
	}

	public void getLastName() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(int lastName) {
		this.lastName = lastName;
	}

	public void getGpa() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param gpa
	 */
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public void getStatus() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	public void getMentor() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mentor
	 */
	public void setMentor(int mentor) {
		this.mentor = mentor;
	}

	public abstract void calculateTuition();

	public void add() {
		throw new UnsupportedOperationException();
	}

	public void query() {
		throw new UnsupportedOperationException();
	}

	public abstract void update() {
		throw new UnsupportedOperationException();
	}

	public void delete() {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public Student() {
		throw new UnsupportedOperationException();
	}

}