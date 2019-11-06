
package acme.features.anonymous.topRecords;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.comprecords.Comprecord;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousTopRecordRepository extends AbstractRepository {

	@Query("Select a from Record a where a.id = ?1")
	Comprecord findOneById(int id);

	@Query("Select a from Record a")
	Collection<Comprecord> findManyAll();

	@Query("Select a from Record a where a.rating = ?1")
	Collection<Comprecord> findSomeAll(String substractedRating);

}
