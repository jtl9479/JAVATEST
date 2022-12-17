package Quiz.score;

public class Subject {

	private int korea;
	private int english;
	private int math;
	private int sumScore;
	
	public Subject(int korea, int english) {
		this.korea = korea;
		this.english = english;
		this.sumScore = english + korea;
	}
	
	public Subject(int korea, int english, int math) {
		this.korea = korea;
		this.english = english;
		this.math = math;
		this.sumScore = english + korea + math;
	}

	public int getKorea() {
		return korea;
	}

	public void setKorea(int korea) {
		this.korea = korea;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSumScore() {
		return sumScore;
	}

	public void setSumScore(int sumScore) {
		this.sumScore = sumScore;
	}
	

	
}
