package com.quiz;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SeerviceIMPL implements QuizService{
	
	@Autowired
	private QuizRepo quizRepo;
	
	
	//for add title

	@Override
	public QuizDTO addTitle(QuizDTO quizDTO) {
		// TODO Auto-generated method stub
		
		
		Quiz quiz = QuizMppaer.mapToquiz(quizDTO);
		Quiz title = quizRepo.save(quiz);
		System.out.println("Account created successfully");
		return QuizMppaer.mapToquizDto(title);
		
	}
	
	
	
	
	//get by id

	@Override
	public QuizDTO get(Long id) {
		// TODO Auto-generated method stub
		
		Quiz quiz = quizRepo.findById( id).orElseThrow(	()-> new RuntimeException( "Id not found sorry " ));
		return QuizMppaer.mapToquizDto(quiz);
		
	}

	
	//get all details
	
//	@Override
//	public List<QuizDTO> allDetails() {
//		// TODO Auto-generated method stub
//		
//		List<Quiz> quizs = quizRepo.findAll();
//		
//		return quizs.stream().map((quiz)-> QuizMppaer.mapToquizDto(quiz)).collect(Collectors.toList());	
//	
//	}

}
