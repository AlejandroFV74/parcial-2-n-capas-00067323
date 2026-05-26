package com.aafv.ejercicioparcialdos.dto.request;

import com.aafv.ejercicioparcialdos.common.enums.ArticleTypeEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateProviderRequest {
    @NotBlank(message = "Article name cannot be empty")
    private String name;

    @NotNull(message = "Type cannot be empty")
    private ArticleTypeEnum type;
}
