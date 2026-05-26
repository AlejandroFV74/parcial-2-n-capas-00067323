package com.aafv.ejercicioparcialdos.dto.response;

import com.aafv.ejercicioparcialdos.common.enums.ArticleTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProviderResponse {
    private UUID id;
    private String name;
    private ArticleTypeEnum type;
}
