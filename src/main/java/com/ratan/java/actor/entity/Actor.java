package com.ratan.java.actor.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(name = "actor", indexes = {
    @Index(name = "idx_actor_last_name", columnList = "last_name")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "actor_id", nullable = false, updatable = false)
    private Integer actorId;

    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

    @Column(name = "last_update", nullable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime lastUpdate;
}
