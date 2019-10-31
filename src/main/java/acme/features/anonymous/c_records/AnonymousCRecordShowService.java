
package acme.features.anonymous.c_records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.c_records.C_Record;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractShowService;

@Service
public class AnonymousCRecordShowService implements AbstractShowService<Anonymous, C_Record> {

	//Internal State

	@Autowired
	private AnonymousCRecordRepository repository;


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

		request.unbind(entity, model, "companyName", "sector", "ceoName", "activDescription", "website", "phone", "email", "companyType", "rating");
	}

	@Override
	public C_Record findOne(final Request<C_Record> request) {
		assert request != null;

		C_Record result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
