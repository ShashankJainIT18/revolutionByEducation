package com.rbe.model;

import jakarta.persistence.*;

@Table(name = "resource_mapping")
public class ResourceMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "resource_id", nullable = false)
    Long resourceId;
    @Column(name = "resource_name")
    String resourceName;
    @Column(name = "reference_id", nullable = false)
    Long referenceId;
    @Column(name = "reference_name")
    String referenceName;
}
