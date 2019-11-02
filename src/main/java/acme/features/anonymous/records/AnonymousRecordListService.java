
package acme.features.anonymous.records;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.records.Record;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousRecordListService implements AbstractListService<Anonymous, Record> {

	@Autowired
	AnonymousRecordRepository repository;


	@Override
	public boolean authorise(final Request<Record> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<Record> findMany(final Request<Record> request) {
		assert request != null;

		Collection<Record> result;

		result = this.repository.findManyAll();

		return result;

	}

	@Override
	public void unbind(final Request<Record> request, final Record entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "companyname", "sector", "activdescription", "rating");
	}

}
