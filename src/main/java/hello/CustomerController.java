package hello;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

	private final CustomerRepository customers;
	
	
	public CustomerController(CustomerRepository customers) {
		this.customers = customers;	
	}

	@GetMapping("/customers")
	public String listAllCustomers(Model model) {
		List<Customer> lista = customers.findAll();
		
		Collections.sort(lista, Comparator.comparing(Customer:: getFirstName));
		
		model.addAttribute("cs", lista);
		return "customersList";
	}


}