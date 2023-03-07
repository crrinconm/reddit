package com.clone.microsvc.categories;

import com.clone.microsvc.categories.models.Category;
import com.clone.microsvc.categories.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	/*@Autowired
	private static CategoryRepository categoryRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	/*for(int=1; i<=10;i++){
		Category category= new Category();
		category.setName ("Name"+i);
		category.setIcon("icon.png");
		categoryRepository.save(category);

	}*/
}
