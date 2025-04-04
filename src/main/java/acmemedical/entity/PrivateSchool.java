/********************************************************************************************************
 * File:  PrivateSchool.java Course Materials CST 8277
 *
 * @author Teddy Yap
 * @author Suhas Udayakumar, Tanek Stuttgraham, Sukhpreet Singh
 */
package acmemedical.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


//TODO PRSC01 - Add missing annotations, please see Week 9 slides page 15.  Value 1 is public and value 0 is private.
//TODO PRSC02 - Is a JSON annotation needed here?
@Entity
@Table(name = "PRIVATE_SCHOOL")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class PrivateSchool extends MedicalSchool implements Serializable {
	private static final long serialVersionUID = 1L;

	@OneToOne(mappedBy = "MedicalSchool")
	MedicalSchool MedicalSchool;
	
	public PrivateSchool() {
		super(false);

	}
}