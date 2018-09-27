package org.foo.test.repositories;

import static org.junit.Assert.assertTrue;

import java.util.stream.StreamSupport;

import org.foo.entities.Student;
import org.foo.repositories.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
/*@Transactional
@ContextConfiguration(classes = { org.foo.Application.class }, loader = AnnotationConfigContextLoader.class)*/
public class StudentRepositoryTester {
	
	Logger logger = LoggerFactory.getLogger(StudentRepositoryTester.class);
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void findAllTester() {
		Iterable<Student> students = studentRepository.findAll();
		for(Student student: students) {
			logger.info(student.toString());
		}
		long size = StreamSupport.stream(students.spliterator(), false).count();
		assertTrue(students != null && size == 3);
	}

}
