package com.wisbo.sistemaodonto.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "formularios")
public class Formulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    private LocalDateTime dataEnvio;
    private String tipoFormulario;
    @Column(columnDefinition = "TEXT")
    private String respostas;
    private String observacoes;
    private String status;
    private LocalDateTime atualizadoEm;
}