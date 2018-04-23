package com.socgen.xpress.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socgen.xpress.domain.Client;

@Repository
public interface ClientDao extends CrudRepository<Client, Long> {

}
