
package acme.features.anonymous.records;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.records.Record;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousRecordRepository extends AbstractRepository {

	@Query("Select a from Record a where a.id = ?1")
	Record findOneById(int id);

	@Query("Select a from Record a")
	Collection<Record> findManyAll();

}
