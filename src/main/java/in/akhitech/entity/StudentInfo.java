package in.akhitech.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentInfo {

	@Id
	private Integer studId;
	private String course;
	private String duration;
	private String city;
	private String name;
}
