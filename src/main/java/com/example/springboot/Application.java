package com.example.springboot;

import com.algo.sorting.MergeSort;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("I have command of Spring Boot Now:");
			int[] inputLocal = new int[]{8,5,9,1,7,10,50,35,1,2};
			MergeSort merge = new MergeSort();
			System.out.println("Sorted: "+ Arrays.toString(merge.sort(inputLocal,0,inputLocal.length-1)));
		};
	}

}

