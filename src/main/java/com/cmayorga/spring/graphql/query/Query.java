package com.cmayorga.spring.graphql.query;

import org.springframework.stereotype.Component;

import com.cmayorga.spring.graphql.schema.dto.SampleRequest;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
/* This is the EntryPoint for resolve the queries for our clients */
public class Query implements GraphQLQueryResolver {

	public String firstQuery() {
		return "First Query";
	}

	public String secondQuery() {
		return "Second Query";
	}
	
	public String fullName(String firstName, String lastName) {
		return firstName +" "+ lastName;
	}
	
	public String fullNameRequestDao(SampleRequest sampleRequest) {
		return sampleRequest.getFirstName() + " " + sampleRequest.getLastName();
	}

}
