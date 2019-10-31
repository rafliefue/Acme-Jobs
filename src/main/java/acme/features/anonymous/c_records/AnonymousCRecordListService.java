
package acme.features.anonymous.c_records;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.c_records.C_Record;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousCRecordListService implements AbstractListService<Anonymous, C_Record> {

	@Autowired
	AnonymousCRecordRepository repository;


	@Override
	public boolean authorise(final Request<C_Record> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<C_Record> request, final C_Record entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "companyName", "sector", "activDescription", "rating");
	}

	@Override
	public Collection<C_Record> findMany(final Request<C_Record> request) {
		assert request != null;

		Collection<C_Record> result;

		result = this.repository.findManyAll();

		return result;
	}

}
