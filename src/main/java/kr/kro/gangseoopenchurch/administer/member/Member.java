package kr.kro.gangseoopenchurch.administer.member;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import kr.kro.gangseoopenchurch.administer.office.Office;
import lombok.Data;

@Data
@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String phone;
	private Date birthdate;
	private String gender;

	@ManyToOne
	@JoinColumn(name = "officeId")
	Office office;
}
