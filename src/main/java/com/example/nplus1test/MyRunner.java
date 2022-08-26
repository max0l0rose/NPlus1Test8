package com.example.nplus1test;

import com.example.nplus1test.model.Beach;
import com.example.nplus1test.repository.BeachRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Transactional // for lifeguards collection
public class MyRunner implements CommandLineRunner {

	final BeachRepository beachRepository;

	@Override
	public void run(String... args) throws InterruptedException
	{
		System.out.println("====== run =======");

		List<Beach> beachList = beachRepository.findAll();
		System.out.println("beachList = " + beachList.size());

		beachList.forEach(b -> {
			System.out.println(b.getName() + " " + b.getLifeguards().size());
		});

		int a = 1;
		System.out.println("---- run exit ----");
	}
}
