package com.aafv.ejercicioparcialdos.model;

import com.aafv.ejercicioparcialdos.common.enums.ArticleTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "magic_article")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
    @OneToOne(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
    private MagicProvider provider;


}
