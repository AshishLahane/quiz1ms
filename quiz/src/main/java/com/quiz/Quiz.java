package com.quiz;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Quiz {
	
	
		
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long id;
		@Column (name = "title")
		private String title;
}
