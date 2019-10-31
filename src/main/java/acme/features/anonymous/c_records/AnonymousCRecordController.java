
package acme.features.anonymous.c_records;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.c_records.C_Record;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/c_records/")
public class AnonymousCRecordController extends AbstractController<Anonymous, C_Record> {

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
