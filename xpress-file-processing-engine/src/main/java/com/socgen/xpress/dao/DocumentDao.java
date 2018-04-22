package com.socgen.xpress.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socgen.xpress.domain.Document;

@Repository
public interface DocumentDao extends CrudRepository<Document, Long>{
    
}
