package co.za.ioco.invoiceservice.invoiceservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.za.ioco.invoiceservice.invoiceservice.entity.Invoice;
import co.za.ioco.invoiceservice.invoiceservice.repository.InvoiceRepository;
import co.za.ioco.invoiceservice.invoiceservice.service.InvoiceService;

/**
 * @author balu
 *
 */

@Service
public class InvoiceServiceImpl implements InvoiceService{

	@Autowired
	private InvoiceRepository invoiceRepository;

	public void setInvoiceRepository(InvoiceRepository invoiceRepository) {
		this.invoiceRepository = invoiceRepository;
	}

	@Override
	public List<Invoice> viewAllInvoices() {
		List<Invoice> invoices = invoiceRepository.findAll();
		return invoices;
	}

	@Override
	public Invoice viewInvoice(Long invoiceId) {

		Optional<Invoice> invoice = invoiceRepository.findById(invoiceId);
		return invoice.get();
	}

	@Override
	public Invoice addInvoice(Invoice invoice) {

		invoiceRepository.save(invoice);
		
		return invoice;
	}
	
	
}
