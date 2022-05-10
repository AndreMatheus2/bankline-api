package com.dio.santander.banklineapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tab_correntista")
@Getter
@Setter
public class Correntista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 20)
    private String cpf;
    @Column(length = 60)
    private String nome;
    @Embedded
    private Conta conta;
}
