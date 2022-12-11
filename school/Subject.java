package school;

import java.util.ArrayList;
import utils.Define;

public class Subject {
	private String subjectName;
	private int subjectId;
	private int gradeType;
	
	//수강 신청한 학생 리스트
	//register() 메서드 호출 시 리스트에 추가됨
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE; // 기본적으로 A, B 타입
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public int getGradeType() {
		return gradeType;
	}
	
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	
	public void register(Student student) { //수강신청
		studentList.add(student);
	}
}
