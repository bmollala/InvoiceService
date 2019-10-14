package co.za.ioco.invoiceservice.invoiceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import co.za.ioco.invoiceservice.invoiceservice.entity.Invoice;
import co.za.ioco.invoiceservice.invoiceservice.service.InvoiceService;

/**
 * @author balu
 *
 */

@RestController
public class InvoiceRestController {

	@Autowired
	private InvoiceService invoiceService;

	public void setInvoiceService(InvoiceService invoiceService) {
		this.invoiceService = invoiceService;
	}
	
	@GetMapping("/api/invoice")
	 public List<Invoice> viewAllInvoices() {
	  List<Invoice> invoices = invoiceService.viewAllInvoices();
	  return invoices;
	 }
	  
	 @GetMapping("/api/invoice/{id}")
	 public Invoice viewInvoice(@PathVariable(name="id") Long invoiceId) {
	  return invoiceService.viewInvoice(invoiceId);
	 }
	  
	 @PostMapping("/api/addInvoice")
	 public Invoice addInvoice(Invoice invoice){
		 invoiceService.addInvoice(invoice);
	  System.out.println("Invoice Saved Successfully");
	  return invoice;
	 }
}
