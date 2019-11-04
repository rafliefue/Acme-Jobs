
package acme.entities.spam;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Spam extends DomainEntity {

	// Identificador

	private static final long	serialVersionUID	= 1L;

	// Atributos

	@NotBlank
	private String				spamwords;

	@NotBlank
	private String				threshold;

	// Atributos derivados

}
