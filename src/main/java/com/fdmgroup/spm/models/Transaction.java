package com.fdmgroup.spm.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Data
@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "productId", referencedColumnName = "id")
	private Product product;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private User user;
	
	private LocalDateTime purchaseDate;
	private LocalDateTime updatePurchaseDate;
	
	@PrePersist
	private void purchaseDate() {
		this.purchaseDate = LocalDateTime.now();
	}
	
	@PreUpdate
	private void updatePurchaseDate() {
		this.updatePurchaseDate = LocalDateTime.now();
	}

}
