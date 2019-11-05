
package acme.features.anonymous.topInvestor;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.investor.Investor;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousTopInvestorRepository extends AbstractRepository {

	@Query("Select a from Investor a where a.id = ?1")
	Investor findOneById(int id);

	@Query("Select a from Investor a")
	Collection<Investor> findManyAll();

	@Query("Select a from Investor a where a.star = ?1")
	Collection<Investor> findSomeAll(Integer substractedStar);

}
