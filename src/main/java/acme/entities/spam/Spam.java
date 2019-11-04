
package acme.entities.spam;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;

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

	@ElementCollection(fetch = FetchType.EAGER)
	private Collection<String>	spamwords;

	private Double				threshold;

	// Atributos derivados

}
