
package acme.features.anonymous.records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.records.Record;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractShowService;

@Service
public class AnonymousRecordShowService implements AbstractShowService<Anonymous, Record> {

	//Internal State

	@Autowired
	private AnonymousRecordRepository repository;


	@Override
	public boolean authorise(final Request<Record> request) {
		assert request != null;

		return true;
	}

	@Override
	public Record findOne(final Request<Record> request) {
		assert request != null;

		Record result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

	@Override
	public void unbind(final Request<Record> request, final Record entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "companyname", "sector", "ceoname", "activdescription", "website", "phone", "email", "companytype", "rating");
	}

}
