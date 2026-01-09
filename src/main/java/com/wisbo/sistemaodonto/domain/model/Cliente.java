package com.wisbo.sistemaodonto.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true, nullable = false)
    private String cpf;
    private LocalDate dataNascimento;
    private String sexo;
    private String estadoCivil;
    private String rg;
    private String orgaoEmissor;
    private String ufRg;
    private Boolean estrangeiro;
    private String preferenciaMusical;
    private Double alturaCm;
    private Double pesoKg;
    private String tipoSangue;
    private String profissao;
    private String whatsapp;
    private String email;
    private String instagram;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String estado;
    private String cidade;
    private Boolean responsavelLegal;
    private Boolean responsavelFinanceiro;
    private String planoOdontologico;
    private String numeroCarteirinha;
    private String statusPaciente;
}