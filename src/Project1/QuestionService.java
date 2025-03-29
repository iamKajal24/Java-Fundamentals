package Project1;

import java.util.Scanner;

public class QuestionService {

	Question[] questions = new Question[5];

	String selection[] = new String[5];

	public QuestionService() {
		questions[0] = new Question(1, "What is Java?", "Object-oriented", "Procedure-oriented", "Functional",
				"Scripting", "Object-oriented");
		questions[1] = new Question(2, "Which company developed Java?", "Sun Microsystems", "Microsoft", "Google",
				"IBM", "Sun Microsystems");
		questions[2] = new Question(3, "What is JVM?", "Java Virtual Machine", "Java Variable Method",
				"Java Visual Machine", "Java Version Manager", "Java Virtual Machine");
		questions[3] = new Question(4, "Which keyword is used to define a class in Java?", "class", "struct", "define",
				"ClassName", "class");
		questions[4] = new Question(5, "Which of the following is not a Java feature?", "Platform independent",
				"Object-oriented", "Pointer-based", "Robust", "Pointer-based");
	}

	public void playQuiz() {
		// System.out.println("in display questions");

		int i = 0;
		for (Question q : questions) {
			System.out.println("Question no : " + q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());

			Scanner scanner = new Scanner(System.in);
			selection[i] = scanner.nextLine();
			i++;
		}

		for (String s : selection) {
			System.out.println(s);
		}
	}

	public void printScore() {
		int score = 0;
		for (int i = 0; i < questions.length; i++) {
			Question ques = questions[i];
			String actualAnswer = ques.getAnswer();

			String userAnswer = selection[i];

			if (actualAnswer.equals(userAnswer)) {
				score++;
			}
		}
		System.out.println("Your score is :  " + score);
	}

}
