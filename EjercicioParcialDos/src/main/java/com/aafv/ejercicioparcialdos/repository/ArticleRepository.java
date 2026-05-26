package com.aafv.ejercicioparcialdos.repository;

import com.aafv.ejercicioparcialdos.common.enums.ArticleTypeEnum;
import com.aafv.ejercicioparcialdos.model.MagicArticle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface ArticleRepository extends JpaRepository<MagicArticle, UUID> {
    boolean existsByName(String name);
    List<MagicArticle> findByFilters(ArticleTypeEnum category, String provider, BigDecimal price);
}
