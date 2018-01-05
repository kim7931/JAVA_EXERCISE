package ichs.science.chapter06;

public class Student {
	String stuName;
	String stuId;
	int korScore;
	int engScore;
	int mathScore;
	
	int avgScore;
	
	void printstudentInfo( ) {
		System.out.println("학생이름 :"+stuName);
		System.out.println("학생번호 :"+stuId);
		System.out.println("국어 성적 :"+korScore);
		System.out.println("영어 성적 :"+engScore);
		System.out.println("수학 성적 :" +mathScore);
		System.out.println("성적 총점 :"+(korScore+mathScore+engScore));
		System.out.println("성적 평균 :"+calculateAVG());
	}
	int calculateAVG() {
		avgScore = (korScore +engScore + mathScore)/3;
		return avgScore;
	}
	void changeStudentId(String newStuId) {
		stuId = newStuId;
	}
}
