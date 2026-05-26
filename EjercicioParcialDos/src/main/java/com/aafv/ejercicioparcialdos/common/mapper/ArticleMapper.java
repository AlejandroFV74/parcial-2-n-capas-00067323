package com.aafv.ejercicioparcialdos.common.mapper;

import com.aafv.ejercicioparcialdos.dto.request.CreateArticleRequest;
import com.aafv.ejercicioparcialdos.dto.request.UpdateArticleRequest;
import com.aafv.ejercicioparcialdos.dto.response.ArticleResponse;
import com.aafv.ejercicioparcialdos.model.MagicArticle;
import com.aafv.ejercicioparcialdos.model.MagicProvider;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {

    public MagicArticle toArticleCreate(CreateArticleRequest request){
        return MagicArticle.builder()
                .name(request.getName())
                .type(request.getType())
                .price(request.getPrice())
                .provider(request.getProvider())
                .build();
    }

    public MagicArticle toArticleUpdate(UpdateArticleRequest request, MagicArticle article){
        article.setName(request.getName());
        article.setType(request.getType());
        article.setPrice(request.getPrice());
        article.setProvider(request.getProvider());
        return article;
    }

    public ArticleResponse toDto(MagicArticle article){
        return ArticleResponse.builder()
                .id(article.getId())
                .name(article.getName())
                .type(article.getType())
                .price(article.getPrice())
                .provider(article.getProvider())
                .build();
    }
}
