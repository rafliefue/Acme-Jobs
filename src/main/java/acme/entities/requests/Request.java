
package acme.entities.requests;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Request extends DomainEntity {

	/**
	 * - The system must store requests, each of which consists
	 * of a title, a creation moment, a deadline, a piece of text
	 * that describes them, and a reward. Every request must have
	 * a unique ticker that must match the following pattern
	 * “RXXXX-99999”, where “R” is letter “R”, “X”
	 * denotes an arbitrary letter, and “9” denotes an arbitrary digit.
	 */
	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "R\\p{Upper}{4}-[0-9]{5}")
	private String				ticker;

	@NotBlank
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				creationMoment;

	@Temporal(TemporalType.TIMESTAMP)
	@Future
	private Date				deadline;

	@NotBlank
	private String				text;

	private Double				reward;

}
