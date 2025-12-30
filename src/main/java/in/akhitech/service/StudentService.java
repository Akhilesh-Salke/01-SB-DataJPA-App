package in.akhitech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.akhitech.entity.StudentInfo;
import in.akhitech.repo.StudentInfoRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentInfoRepository studentInfoRepository;
	
	public void test() {
		String name = studentInfoRepository.getClass().getName();
		System.out.println("Repo impl class name :: " + name);
	}
	
	public void saveStudent() {
		StudentInfo u = new StudentInfo();
		
		u.setStudId(808);
		u.setName("Karan");
		u.setCity("HYD");
		u.setDuration("7 months");
		u.setCourse("JRTP");
		
		StudentInfo save = studentInfoRepository.save(u);
		System.out.println("Student Saved ...");
		
		System.out.println(save);
	}
	
	public void getAllStudents() {
		Iterable<StudentInfo> all = studentInfoRepository.findAll();
		
		all.forEach(System.out::println);
	}

}
