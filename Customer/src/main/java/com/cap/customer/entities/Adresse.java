package com.cap.customer.entities;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Adresse {

	String rue,ville,pays,code;
}
