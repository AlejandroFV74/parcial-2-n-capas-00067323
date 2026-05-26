package com.aafv.ejercicioparcialdos.service.imp;

import com.aafv.ejercicioparcialdos.common.enums.ArticleTypeEnum;
import com.aafv.ejercicioparcialdos.common.mapper.ArticleMapper;
import com.aafv.ejercicioparcialdos.dto.request.CreateArticleRequest;
import com.aafv.ejercicioparcialdos.dto.request.UpdateArticleRequest;
import com.aafv.ejercicioparcialdos.dto.response.ArticleResponse;
import com.aafv.ejercicioparcialdos.exception.BusinessRuleException;
import com.aafv.ejercicioparcialdos.exception.ResourceNotFoundException;
import com.aafv.ejercicioparcialdos.model.MagicArticle;
import com.aafv.ejercicioparcialdos.repository.ArticleRepository;
import com.aafv.ejercicioparcialdos.service.ArticleService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;

    @Override
    @Transactional
    public ArticleResponse createArticle(CreateArticleRequest articleRequest){
        if(articleRepository.existsByName(articleRequest.getName())){
            throw new BusinessRuleException("An article with this name already exists");
        }

        return articleMapper.toDto(
                articleRepository.save(articleMapper.toArticleCreate(articleRequest))
        );
    }

    @Override
    public ArticleResponse getArticleById(UUID id){
        return articleMapper.toDto(
                articleRepository.findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Article didn't match any search"))
        );
    }

    @Override
    public List<ArticleResponse> getArticlesByFilters(
            ArticleTypeEnum category,
            String provider,
            BigDecimal price
    ) {
        return articleRepository.findByFilters(category, provider, price)
                .stream()
                .map(articleMapper::toDto)
                .toList();
    }

    @Override
    @Transactional
    public ArticleResponse updateArticle(UpdateArticleRequest articleRequest, UUID id){
        MagicArticle article = articleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Article didn't match any search"));


        MagicArticle updateArticle = articleMapper.toArticleUpdate(articleRequest, article);

        return articleMapper.toDto(articleRepository.save(updateArticle));

    }

    @Override
    @Transactional
    public ArticleResponse deleteArticle(UUID id){
        MagicArticle article = articleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Article didn't match any search"));
        articleRepository.deleteById(id);
        return articleMapper.toDto(article);
    }



}
