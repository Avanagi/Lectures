package org.example.service;

import org.example.model.DocumentDto;

import java.util.HashMap;
import java.util.Map;

public class DocumentService {

    public static Map<Long, DocumentDto> documents = new HashMap<>();

    static {
        DocumentDto document1 = new DocumentDto("document-1");
        DocumentDto document2 = new DocumentDto("document-2");
        DocumentDto document3 = new DocumentDto("document-3");

        documents.put(1L, document1);
        documents.put(2L, document2);
        documents.put(3L, document3);
    }

    public Map<Long, DocumentDto> getAllDocuments() {
        return documents;
    }

    public DocumentDto getById(Long id) {
        return documents.get(id);
    }

}
