package com.kurly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@ToString
public class Product extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pro_id")
	private Long id;
	
	@NotBlank(message = "상품 이름은 필수 입력내용입니다.")
	private String productNm;
	
	@NotNull(message = "가격은 필수 입력내용입니다.")
	private int price;
	
	@NotNull(message = "재고는 필수 입력내용입니다.")
	private int stock;
	
	private String detail;
	
	//@Enumerated
	//private Status
	
	private int soldQty;
	
	private int reviewCount;
}
