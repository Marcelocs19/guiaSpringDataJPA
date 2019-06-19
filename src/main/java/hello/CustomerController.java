package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;


@Controller
public class CustomerController {

    //@GetMapping("/customers")
//    public String listAllCustomers(Model model) {
//		List<Customer> lista = new ArrayList<Customer>();
//		lista.add(new Customer("João", "Silva"));
//		lista.add(new Customer("Marcelo", "Campos"));
//		lista.add(new Customer("Letícia", "Corrêa"));
 //       model.addAttribute("cs", lista);
 //       return "customersList";
   // }
	
	@GetMapping("/customersList.html")
	//@ResponseBody
	public List<Customer> getLista(){
		List<Customer> lista = new ArrayList<Customer>();
		Customer c1 = new Customer("João", "Silva");
		lista.add(c1);
		lista.add(new Customer("Marcelo", "Campos"));
		lista.add(new Customer("Letícia", "Corrêa"));
		return lista;
	}
}