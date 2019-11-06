
package acme.features.anonymous.topRecords;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.comprecords.Comprecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousTopRecordListService implements AbstractListService<Anonymous, Comprecord> {

	@Autowired
	AnonymousTopRecordRepository repository;


	@Override
	public boolean authorise(final Request<Comprecord> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<Comprecord> findMany(final Request<Comprecord> request) {
		assert request != null;

		Collection<Comprecord> result;

		String rating = "5";

		result = this.repository.findSomeAll(rating);

		return result;
	}

	@Override
	public void unbind(final Request<Comprecord> request, final Comprecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "companyname", "sector", "activdescription", "rating");
	}

}
