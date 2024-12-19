package com.rbe.dto;

import com.rbe.model.DocumentStatus;
import com.rbe.model.DocumentType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DocumentDto {
    public String title;
    public String description;
    public String fileType;
    public DocumentStatus status;
    private String link;
    Double size;
    public LocalDateTime uploadedAt;
    public LocalDateTime updatedAt;
    public String lastUploadedBy;
    public DocumentType documentType;

}
