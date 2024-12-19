package com.rbe.shashank.controller;

import com.rbe.dto.DocumentDto;
import com.rbe.shashank.service.DocumentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("document")
public class DocumentController {

    @Autowired
    DocumentService documentService;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping
    public ResponseEntity<String> addDoc(@Validated @RequestBody DocumentDto documentDto) {
        logger.info("Request received to add document. REQUEST : " + documentDto);
        documentService.addDocument(documentDto);
        return ResponseEntity.ok("Document is added successfully.");
    }
}
