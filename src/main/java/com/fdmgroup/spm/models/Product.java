package com.fdmgroup.spm.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private BigDecimal price;
	private String description;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	@PrePersist
	private void createdAt() {
		this.createdAt = LocalDateTime.now();
	}

	@PreUpdate
	private void updatedAt() {
		this.updatedAt = LocalDateTime.now();
	}
}
