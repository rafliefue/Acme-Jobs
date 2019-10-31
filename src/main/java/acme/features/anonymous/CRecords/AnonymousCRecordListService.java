
package acme.features.anonymous.CRecords;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.CRecords.CRecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousCRecordListService implements AbstractListService<Anonymous, CRecord> {

	@Autowired
	AnonymousCRecordRepository repository;


	@Override
	public boolean authorise(final Request<CRecord> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<CRecord> request, final CRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "companyName", "sector", "activDescription", "rating");
	}

	@Override
	public Collection<CRecord> findMany(final Request<CRecord> request) {
		assert request != null;

		Collection<CRecord> result;

		result = this.repository.findManyAll();

		return result;
	}

}
