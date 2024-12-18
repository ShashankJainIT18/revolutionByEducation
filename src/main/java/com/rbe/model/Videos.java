package com.rbe.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "videos")
public class Videos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String title;
    String description;
    @Column(nullable = false)
    String link;
    @Column(name = "file_type")
    String fileType;
    @Column(nullable = false)
    VideoFileStatus status;
    @CreationTimestamp
    @Column(name = "uploaded_at", nullable = false, updatable = false)
    LocalDateTime uploadedAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    LocalDateTime updatedAt;
    @Column(nullable = false, name = "last_uploaded_by")
    String lastUploadedBy;
    Double size;
}

enum VideoFileStatus {
    ACTIVE, IN_ACTIVE
}
