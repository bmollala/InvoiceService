package co.za.ioco.invoiceservice.invoiceservice.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author balu
 *
 */

@Entity
@Table(name="INVOICE")
public class Invoice {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="CLIENT")
	private String client;
	
	@Column(name="VAT_RATE")
	private Long vatRate;
	
	@Column(name="INVOICE_DATE")
	private Date invoiceDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public Long getVatRate() {
		return vatRate;
	}
	public void setVatRate(Long vatRate) {
		this.vatRate = vatRate;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
	public BigDecimal getSubTotal() {
		return new BigDecimal(BigInteger.ZERO);
	}
	
	public BigDecimal getVat() {
		return new BigDecimal(BigInteger.ZERO);
	}
	
	public BigDecimal getTotal() {
		return new BigDecimal(BigInteger.ZERO);
	}
}
