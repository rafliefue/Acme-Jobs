
package acme.features.anonymous.CRecords;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.CRecords.CRecord;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/CRecord/")
public class AnonymousCRecordController extends AbstractController<Anonymous, CRecord> {

	//Internal state

	@Autowired
	private AnonymousCRecordListService	listService;

	@Autowired
	private AnonymousCRecordShowService	showService;


	//Constructores

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}

}
