package com.socgen.xpress.service;

import org.springframework.web.multipart.MultipartFile;

import com.socgen.xpress.domain.Document;

import java.io.IOException;
import java.util.List;

public interface DocumentService {

    ResponseMetadata save(MultipartFile multipartFile) throws IOException;

    byte[] getDocumentFile(Long id);

    List<Document> findAll();
}
