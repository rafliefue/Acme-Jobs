
package acme.entities.records;

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
public class Record extends DomainEntity {

	//Identificador

	private static final long	serialVersionUID	= 1L;

	//Atributos

	@NotBlank
	private String				companyname;

	@NotBlank
	private String				sector;

	@NotBlank
	private String				ceoname;

	@NotBlank
	private String				activdescription;

	@NotBlank
	private String				website;

	@NotBlank
	private String				phone;

	@NotBlank
	@Email
	private String				email;

	@NotBlank
	private String				companytype;

	@NotBlank
	@Range(min = 0, max = 5)
	private String				rating;
}
