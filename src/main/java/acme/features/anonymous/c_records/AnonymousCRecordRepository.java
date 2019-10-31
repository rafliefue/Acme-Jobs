
package acme.features.anonymous.c_records;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.c_records.C_Record;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousCRecordRepository extends AbstractRepository {

	@Query("Select a from C_Record a where a.id = ?1")
	C_Record findOneById(int id);

	@Query("Select a from C_Record a")
	Collection<C_Record> findManyAll();

}
