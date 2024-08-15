package com.ms.api_vendinha.domain.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private Integer id;

    @Column(name ="nome")
    private String nome;
}
