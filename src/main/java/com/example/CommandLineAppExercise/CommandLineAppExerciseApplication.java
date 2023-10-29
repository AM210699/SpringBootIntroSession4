package com.example.CommandLineAppExercise;

import com.example.CommandLineAppExercise.model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CommandLineAppExerciseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CommandLineAppExerciseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the name: ");
		String name = reader.nextLine();

		System.out.println("Enter the telephone number: ");
		String telephone = reader.nextLine();

		Person person = new Person(name, telephone);

		System.out.println(person);
	}
}
