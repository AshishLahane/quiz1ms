package com.quiz;

public class QuizMppaer {


	
	
public static Quiz mapToquiz(QuizDTO quizDTO ) {
		
		Quiz quiz = new Quiz(
				quizDTO.getId(),
				quizDTO.getTitle()
				
				);
		return quiz;
}

public static QuizDTO mapToquizDto(Quiz quiz ) {
	
	QuizDTO quizDTO = new QuizDTO(
			
			quiz.getId(),
			quiz.getTitle()
			);
	
	return quizDTO;
}
	
}
