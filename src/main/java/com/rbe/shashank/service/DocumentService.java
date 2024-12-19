package com.rbe.shashank.service;

import com.rbe.dto.DocumentDto;
import com.rbe.model.Document;
import com.rbe.model.DocumentStatus;
import com.rbe.model.DocumentType;
import com.rbe.shashank.repositories.DocumentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    @Autowired
    DocumentRepo documentRepo;

    public void addDocument(DocumentDto documentDto) {
        // handle idempotency here
        Document document = new Document(null, documentDto.title, documentDto.description, documentDto.fileType, DocumentStatus.ACTIVE, documentDto.getLink(), null, null, null, documentDto.lastUploadedBy, DocumentType.SUBJECT);
        // get username from request header
        documentRepo.save(document);
    }
}
