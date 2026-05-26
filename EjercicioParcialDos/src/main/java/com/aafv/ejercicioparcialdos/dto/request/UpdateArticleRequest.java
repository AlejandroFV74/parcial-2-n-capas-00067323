package com.aafv.ejercicioparcialdos.dto.request;

import com.aafv.ejercicioparcialdos.common.enums.ArticleTypeEnum;
import com.aafv.ejercicioparcialdos.model.MagicProvider;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateArticleRequest {
    private String name;
    private ArticleTypeEnum type;
    private BigDecimal price;
    private MagicProvider provider;
}
