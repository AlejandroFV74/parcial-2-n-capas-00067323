package com.aafv.ejercicioparcialdos.service.imp;

import com.aafv.ejercicioparcialdos.common.mapper.ProviderMapper;
import com.aafv.ejercicioparcialdos.repository.ProviderRepository;
import com.aafv.ejercicioparcialdos.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProviderServiceImpl implements ProviderService {
    private final ProviderRepository providerRepository;
    private final ProviderMapper providerMapper;


}
