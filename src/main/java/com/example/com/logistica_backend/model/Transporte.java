package com.example.com.logistica_backend.model;

import lombok.*;
import javax.persistence.*;


@Entity
@Table(name = "transporte")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Transporte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "transporte")
    private Long id_transporte;

    @ManyToOne
    @JoinColumn(name = "id_tipo_transporte", referencedColumnName = "id_tipo_transporte")
    private TipoTransporte tipoTransporte;

    @Column(name = "identificador")
    private String identificador;

}
