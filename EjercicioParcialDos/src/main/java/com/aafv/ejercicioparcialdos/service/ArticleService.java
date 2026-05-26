package com.aafv.ejercicioparcialdos.service;

import com.aafv.ejercicioparcialdos.common.enums.ArticleTypeEnum;
import com.aafv.ejercicioparcialdos.dto.request.CreateArticleRequest;
import com.aafv.ejercicioparcialdos.dto.request.UpdateArticleRequest;
import com.aafv.ejercicioparcialdos.dto.response.ArticleResponse;
import com.aafv.ejercicioparcialdos.repository.ArticleRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface ArticleService {
    ArticleResponse createArticle(CreateArticleRequest createArticleRequest);
    ArticleResponse getArticleById(UUID id);
    List<ArticleResponse> getArticlesByFilters(ArticleTypeEnum category, String provider, BigDecimal price);
    ArticleResponse updateArticle(UpdateArticleRequest article, UUID id);
    ArticleResponse deleteArticleById(UUID id);

}
