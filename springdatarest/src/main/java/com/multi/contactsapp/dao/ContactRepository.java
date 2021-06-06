package com.multi.contactsapp.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.multi.contactsapp.domain.Contact;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "contacts2")
public interface ContactRepository extends JpaRepository<Contact, Long> {

	@RestResource(path = "findbyname", exported = true)
	List<Contact> findByNameContainingOrderByNameDesc(@Param("name") String name);
//
//	@RestResource(path = "findbyname", exported = true)
//	 Page<Contact> findByNameContaining(@Param("name") String name, Pageable pageable);
	
//	@RestResource(path = "findbyname", exported = true)
//	List<Contact> findByNameContainingOrderByNameDesc(@Param("name") String name);
}