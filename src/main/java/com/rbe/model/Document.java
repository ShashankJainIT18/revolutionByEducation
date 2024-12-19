package com.rbe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Table(name = "document")
@Entity
@AllArgsConstructor
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable = false)
    public String title;
    public String description;
    @Column(name = "file_type")
    public String fileType;
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    public DocumentStatus status;
    @Column(nullable = false)
    public String link;
    public Double size;
    @CreationTimestamp
    @Column(nullable = false, name = "uploaded_at", updatable = false)
    public LocalDateTime uploadedAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    public LocalDateTime updatedAt;
    @Column(name = "last_uploaded_by")
    public String lastUploadedBy;
    @Column(nullable = false, name = "document_type")
    @Enumerated(value = EnumType.STRING)
    public DocumentType documentType;
}

