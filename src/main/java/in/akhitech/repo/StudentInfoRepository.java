package in.akhitech.repo;

import org.springframework.data.repository.CrudRepository;

import in.akhitech.entity.StudentInfo;

public interface StudentInfoRepository extends CrudRepository<StudentInfo, Integer>{

}
