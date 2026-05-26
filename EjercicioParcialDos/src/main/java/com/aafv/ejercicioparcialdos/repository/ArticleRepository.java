package com.aafv.ejercicioparcialdos.repository;

import com.aafv.ejercicioparcialdos.model.MagicArticle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ArticleRepository extends JpaRepository<MagicArticle, UUID> {
    boolean existsByName(String name);
}
