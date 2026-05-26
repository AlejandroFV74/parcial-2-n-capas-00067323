package com.aafv.ejercicioparcialdos.model;

import com.aafv.ejercicioparcialdos.common.enums.ArticleTypeEnum;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "magic_provider")
public class MagicProvider {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String name;

    @Column
    private ArticleTypeEnum type;
}
