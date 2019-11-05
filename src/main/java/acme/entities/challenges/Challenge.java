
package acme.entities.challenges;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Challenge extends DomainEntity {
	//Identificador

	private static final long	serialVersionUID	= 1L;

	//Atributos

	@NotBlank
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

	@Temporal(TemporalType.TIMESTAMP)
	private Date				deadline;

	@NotBlank
	private String				description;

	@NotBlank
	private String				goalBronze;

	@NotBlank
	private String				goalSilver;

	@NotBlank
	private String				goalGold;

	@NotNull
	private BigDecimal			rewardBronze;

	@NotNull
	private BigDecimal			rewardSilver;

	@NotNull
	private BigDecimal			rewardGold;

}
