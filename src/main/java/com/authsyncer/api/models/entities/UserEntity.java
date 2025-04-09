package com.authsyncer.api.models.entities;

import com.authsyncer.api.models.entities.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class UserEntity extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ProjectEntity> projects;

    @PrePersist
    @Override
    public void prePersist() {
        super.prePersist();
    }
}
