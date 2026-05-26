package com.aafv.ejercicioparcialdos.service;

import com.aafv.ejercicioparcialdos.dto.request.CreateProviderRequest;
import com.aafv.ejercicioparcialdos.dto.request.UpdateProviderRequest;
import com.aafv.ejercicioparcialdos.dto.response.ProviderResponse;

import java.util.UUID;

public interface ProviderService {
    ProviderResponse createProvider(CreateProviderRequest request);
    ProviderResponse updateProvider(UpdateProviderRequest request, UUID id);
    ProviderResponse deleteProvider(UUID id);
    ProviderResponse getProviderById(UUID id);
}
