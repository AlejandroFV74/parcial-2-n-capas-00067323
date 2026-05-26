package com.aafv.ejercicioparcialdos.model;

import com.aafv.ejercicioparcialdos.common.enums.ArticleTypeEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "magic_article")
public class MagicArticle {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private ArticleTypeEnum type;

    @Column
    private BigDecimal price;
    //como se soluciona que este tipo sea container
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
    private MagicProvider provider;


}
