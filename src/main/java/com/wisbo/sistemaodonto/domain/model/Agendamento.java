package com.wisbo.sistemaodonto.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private LocalDateTime dataAgendamento;
    private String status;
    private String observacoes;
    private String profissional;
    private String procedimento;
    private BigDecimal valor;
    private Boolean confirmado;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
}