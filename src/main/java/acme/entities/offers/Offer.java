
package acme.entities.offers;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Offer extends DomainEntity {

	//Identificador

	private static final long	serialVersionUID	= 1L;

	//Atributos

	@NotBlank
	@NotNull
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

	//Atributo Deadline
	@Temporal(TemporalType.TIMESTAMP)
	private Date				deadLine;

	@NotBlank
	private String				text;

	//Atributo Precio Oferta

	@NotNull
	@Valid
	private Money				offer;

	//Ticker
	@Pattern(regexp = "O\\p{Upper}{4}-[0-9]{5}")
	@Column(unique = true)
	@NotBlank
	private String				ticker;

}
