
package acme.features.anonymous.CRecords;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.CRecords.CRecord;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousCRecordRepository extends AbstractRepository {

	@Query("Select a from CRecord a where a.id = ?1")
	CRecord findOneById(int id);

	@Query("Select a from CRecord a")
	Collection<CRecord> findManyAll();

}
