package com.hxsd.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name="t_a_book_type")
public class BookType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length=10)
	private String name; //类型名称
	@NotNull(message="排序号不能为空！")
	@Column(length=10)
	private Integer orderNo;
	//创建时间
	@Temporal(TemporalType.TIMESTAMP) 
	private Date createDateTime;
	//修改时间
	@Temporal(TemporalType.TIMESTAMP) 
	private Date updateDateTime;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	public Date getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
	
	
	
	
}
