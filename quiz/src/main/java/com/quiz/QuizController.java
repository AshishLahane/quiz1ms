package com.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	
	@Autowired
	private QuizService quizService;
	
	
	


	@PostMapping
	public ResponseEntity<QuizDTO> addTitle (@RequestBody QuizDTO quizDTO)  //request body for getting values in table
	{
		return new ResponseEntity<>(quizService.addTitle(quizDTO), HttpStatus.CREATED);

	}
	
	// get by id
	@GetMapping("/{id}")
	public  ResponseEntity<QuizDTO> getById (@PathVariable Long  id){
		
		QuizDTO quizDTO = quizService.get(id);
		return ResponseEntity.ok(quizDTO);
	}
	
}
