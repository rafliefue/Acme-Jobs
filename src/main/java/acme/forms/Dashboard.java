
package acme.forms;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dashboard extends DomainEntity {

	// Identificador

	private static final long serialVersionUID = 1L;

	//Atributos

	private Integer announcementcount;
}
