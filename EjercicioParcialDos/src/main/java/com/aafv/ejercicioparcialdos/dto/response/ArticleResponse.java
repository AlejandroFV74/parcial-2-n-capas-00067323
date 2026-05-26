package com.aafv.ejercicioparcialdos.dto.response;

import com.aafv.ejercicioparcialdos.common.enums.ArticleTypeEnum;
import com.aafv.ejercicioparcialdos.model.MagicProvider;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class ArticleResponse {
    private UUID id;
    private String name;
    private ArticleTypeEnum type;
    private BigDecimal price;
    private MagicProvider provider;
}
