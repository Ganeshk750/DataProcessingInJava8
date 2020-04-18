package com.ganesh.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CreateSpliterator {
	
	public static void main(String[] args) {
		
		Path path = Paths.get("D:\\Collection project\\git\\DataProcessingInJava8\\DataProcessingInJava8\\peoples.txt");
		
		try {
			Stream<String> lines = Files.lines(path);
			
			Spliterator<String> linesSpliterator = lines.spliterator();
			Spliterator<Person> personSpliterator = new PersonSpliterator(linesSpliterator);
			
			Stream<Person> person = StreamSupport.stream(personSpliterator, false);
			person.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
