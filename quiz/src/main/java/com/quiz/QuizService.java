package com.quiz;



import org.springframework.stereotype.Service;


@Service
public interface QuizService {
	
	QuizDTO addTitle (QuizDTO quizDTO);
	
	QuizDTO get(Long id);
	
	//List<QuizDTO> allDetails();
	


}
