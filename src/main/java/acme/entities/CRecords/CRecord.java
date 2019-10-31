
package acme.entities.CRecords;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CRecord extends DomainEntity {

	//Identificador

	private static final long	serialVersionUID	= 1L;

	//Atributos

	@NotBlank
	private String				companyName;

	@NotBlank
	private String				sector;

	@NotBlank
	private String				ceoName;

	@NotBlank
	private String				activDescription;

	@NotBlank
	private String				website;

	@NotBlank
	private String				phone;

	@NotBlank
	@Email
	private String				email;

	@NotBlank
	private String				companyType;

	@NotBlank
	@Range(min = 0, max = 5)
	private String				rating;
}
