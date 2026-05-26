package com.aafv.ejercicioparcialdos.dto.request;

import com.aafv.ejercicioparcialdos.common.enums.ArticleTypeEnum;
import com.aafv.ejercicioparcialdos.model.MagicProvider;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateArticleRequest {
    @NotBlank(message = "Article name cannot be empty")
    private String name;

    @NotNull(message = "Type cannot be empty")
    private ArticleTypeEnum type;

    @NotBlank(message = "Price cannot be empty")
    private BigDecimal price;

    @NotBlank(message = "A provider is required")
    private MagicProvider provider;
}
