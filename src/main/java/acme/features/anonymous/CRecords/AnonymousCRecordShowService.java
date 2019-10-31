
package acme.features.anonymous.CRecords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.CRecords.CRecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractShowService;

@Service
public class AnonymousCRecordShowService implements AbstractShowService<Anonymous, CRecord> {

	//Internal State

	@Autowired
	private AnonymousCRecordRepository repository;


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

		request.unbind(entity, model, "companyName", "sector", "ceoName", "activDescription", "website", "phone", "email", "companyType", "rating");
	}

	@Override
	public CRecord findOne(final Request<CRecord> request) {
		assert request != null;

		CRecord result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
