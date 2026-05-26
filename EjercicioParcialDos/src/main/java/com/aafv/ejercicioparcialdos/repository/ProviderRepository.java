package com.aafv.ejercicioparcialdos.repository;

import com.aafv.ejercicioparcialdos.model.MagicArticle;
import com.aafv.ejercicioparcialdos.model.MagicProvider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProviderRepository extends JpaRepository<MagicProvider, UUID> {

}
