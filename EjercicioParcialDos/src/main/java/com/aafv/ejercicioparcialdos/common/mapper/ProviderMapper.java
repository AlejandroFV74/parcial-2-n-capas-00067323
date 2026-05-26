package com.aafv.ejercicioparcialdos.common.mapper;

import com.aafv.ejercicioparcialdos.dto.request.CreateArticleRequest;
import com.aafv.ejercicioparcialdos.dto.request.UpdateArticleRequest;
import com.aafv.ejercicioparcialdos.dto.response.ProviderResponse;
import com.aafv.ejercicioparcialdos.model.MagicProvider;

public class ProviderMapper {
    public MagicProvider toProviderCreate(CreateArticleRequest request){
        return MagicProvider.builder()
                .name(request.getName())
                .type(request.getType())
                .build();
    }

    public MagicProvider toProviderUpdate(UpdateArticleRequest request){
        return MagicProvider.builder()
                .id(request.getProvider().getId())
                .name(request.getName())
                .type(request.getType())
                .build();
    }

    public ProviderResponse toDto(MagicProvider provider){
        return ProviderResponse.builder()
                .id(provider.getId())
                .name(provider.getName())
                .type(provider.getType())
                .build();
    }

}
