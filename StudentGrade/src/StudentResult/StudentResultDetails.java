package StudentResult;

class StudentResultDetails {

	private String name;
	private int Id;
	private String[] subject;
	private int[] marks;
	private String[] grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String[] getSubject() {
		return subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String[] getGrade() {
		return grade;
	}
	public void setGrade(String[] grade) {
		this.grade = grade;
	}
	
}
