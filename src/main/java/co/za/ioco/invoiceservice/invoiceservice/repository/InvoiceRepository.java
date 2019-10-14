package co.za.ioco.invoiceservice.invoiceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.za.ioco.invoiceservice.invoiceservice.entity.Invoice;

/**
 * @author balu
 *
 */

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
