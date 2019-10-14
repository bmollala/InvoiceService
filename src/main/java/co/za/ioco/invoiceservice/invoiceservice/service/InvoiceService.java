package co.za.ioco.invoiceservice.invoiceservice.service;

import java.util.List;

import co.za.ioco.invoiceservice.invoiceservice.entity.Invoice;

/**
 * @author balu
 *
 */

public interface InvoiceService {

	public List<Invoice> viewAllInvoices();
	  
	 public Invoice viewInvoice(Long invoiceId);
	  
	 public Invoice addInvoice(Invoice invoice);
	  
}
