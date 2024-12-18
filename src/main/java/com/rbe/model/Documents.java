package com.rbe.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Table(name = "documents")
@Entity
@Data
@NoArgsConstructor
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String title;
    String description;
    @Column(name = "file_type")
    String fileType;
    @Column(nullable = false)
    DocumentStatus status;
    @Column(nullable = false)
    String link;
    Double size;
    @CreationTimestamp
    @Column(nullable = false, name = "uploaded_at", updatable = false)
    LocalDateTime uploadedAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    LocalDateTime updatedAt;
    @Column(name = "last_uploaded_by")
    String lastUploadedBy;
    @Column(nullable = false, name = "document_type")
    DocumentType documentType;
}

enum DocumentStatus {
    ACTIVE, IN_ACTIVE
}

enum DocumentType {
    SUBJECT, ANALYSIS, OTHER
}