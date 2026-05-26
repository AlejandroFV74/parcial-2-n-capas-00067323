package com.aafv.ejercicioparcialdos.dto.request;

import com.aafv.ejercicioparcialdos.model.MagicProvider;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProviderRequest {
    private String name;
    private MagicProvider provider;
}
