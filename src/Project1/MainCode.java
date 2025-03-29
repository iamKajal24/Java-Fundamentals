package Project1;

public class MainCode {
	
	public static void main(String[] args) {
		QuestionService service = new QuestionService();
		service.playQuiz();
		
		service.printScore();
	}
}
