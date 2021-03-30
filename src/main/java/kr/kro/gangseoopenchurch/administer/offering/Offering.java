package kr.kro.gangseoopenchurch.administer.offering;

import java.lang.reflect.Member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Offering {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int amount;

	@ManyToOne
	@JoinColumn(name = "memberId")
	Member member;

	@ManyToOne
	@JoinColumn(name = "offeringtypeId")
	Offeringtype offeringtype;
}
