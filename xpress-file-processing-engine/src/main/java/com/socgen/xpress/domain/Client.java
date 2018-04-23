package com.socgen.xpress.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String tiagramName;
	@Column
	private String configName;
	@Column
	private String clientName;
	@Column
	private String ecid;
	@Column
	private String billingCurrency;
	@Column
	private String costCenter;
	@Column
	private String accountNumber;
	@Column
	private String salesDesk;
	@Column
	private String executiveName;
	@Column
	private String billingRegion;
	@Column
	private String emailId;
	@Column
	private String bookingEntity;
	@Column
	private String accountType;
	@Column
	private String originalEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTiagramName() {
		return tiagramName;
	}

	public void setTiagramName(String tiagramName) {
		this.tiagramName = tiagramName;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getEcid() {
		return ecid;
	}

	public void setEcid(String ecid) {
		this.ecid = ecid;
	}

	public String getBillingCurrency() {
		return billingCurrency;
	}

	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSalesDesk() {
		return salesDesk;
	}

	public void setSalesDesk(String salesDesk) {
		this.salesDesk = salesDesk;
	}

	public String getExecutiveName() {
		return executiveName;
	}

	public void setExecutiveName(String executiveName) {
		this.executiveName = executiveName;
	}

	public String getBillingRegion() {
		return billingRegion;
	}

	public void setBillingRegion(String billingRegion) {
		this.billingRegion = billingRegion;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getBookingEntity() {
		return bookingEntity;
	}

	public void setBookingEntity(String bookingEntity) {
		this.bookingEntity = bookingEntity;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getOriginalEntity() {
		return originalEntity;
	}

	public void setOriginalEntity(String originalEntity) {
		this.originalEntity = originalEntity;
	}

}
