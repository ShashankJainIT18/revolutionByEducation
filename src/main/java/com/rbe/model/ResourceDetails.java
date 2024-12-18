package com.rbe.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Table(name = "resource_details")
@Entity
@Data
@NoArgsConstructor
public class ResourceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String detail;
    ResourceDetailsStatus status;
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    LocalDateTime createdAt;
    @Column(nullable = false, name = "updated_at")
    @UpdateTimestamp
    LocalDateTime updatedAt;
    @Column(name = "updated_by")
    String updatedBy;
    // will maintain history later
}

enum ResourceDetailsStatus {
    ACTIVE, IN_ACTIVE
}