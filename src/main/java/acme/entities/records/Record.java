
package acme.entities.records;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

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
	@Pattern(regexp = "^([+][0-9]{3}[ ]{1}[\\(]{1}[0-9]{4}[\\)]{1}[ ]{1}[0-9]{6})$", message = "The phone number has to follow the following pattern: “+999 (9999) 999999")
	private String				phone;

	@NotBlank
	@Email
	private String				email;

	@NotBlank
	@Pattern(regexp = "[I]{1}[n]{1}[c]{1}|[L]{1}[L]{1}[C]{1}", flags = Pattern.Flag.CASE_INSENSITIVE, message = "The company type can only be 'Inc' or 'LLC'")
	private String				companytype;

	@NotBlank
	@Range(min = 0, max = 5)
	private String				rating;
}
