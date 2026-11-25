package com.barbearia.api.model;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clientes", uniqueConstraints = {
@UniqueConstraint(columnNames = "telefone", name = "uk_cliente_telefone")
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 20)
    private String telefone;
    // incluir CPF e RG ao projeto
    @Column(nullable = false, length = 20)
    private long CPF;
    
    @Column(nullable = false, length = 20)
    private long RG;
}
