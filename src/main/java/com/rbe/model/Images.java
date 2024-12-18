package com.rbe.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Table(name = "images")
@Entity
@Data
@NoArgsConstructor
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;
    @Column(columnDefinition = "TEXT")
    String description;
    @Column(nullable = false, name = "image_type")
    ImageType imageType;
    Double size;
    @Column(nullable = false)
    String link;
    @CreationTimestamp
    @Column(name = "uploaded_at", nullable = false, updatable = false)
    LocalDateTime uploadedAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    LocalDateTime updatedAt;
    @Column(name = "last_uploaded_by")
    String lastUploadedBy;
    @Column(nullable = false, name = "image_status")
    ImageStatus imageStatus;
}

enum ImageType {
    THUMBNAIL, SUBJECT_RELATED, ANALYSIS, OTHER
}

enum ImageStatus {
    ACTIVE, IN_ACTIVE
}
