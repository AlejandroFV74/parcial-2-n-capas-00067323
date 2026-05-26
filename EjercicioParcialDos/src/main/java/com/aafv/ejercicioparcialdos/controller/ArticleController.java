package com.aafv.ejercicioparcialdos.controller;

import com.aafv.ejercicioparcialdos.dto.request.CreateArticleRequest;
import com.aafv.ejercicioparcialdos.dto.response.ArticleResponse;
import com.aafv.ejercicioparcialdos.dto.response.GeneralResponse;
import com.aafv.ejercicioparcialdos.service.ArticleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/article")
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @PostMapping("/create")
    public ResponseEntity<GeneralResponse> createProduct(@Valid @RequestBody CreateArticleRequest request) {
        ArticleResponse articleResponse = articleService.createArticle(request);
        return buildResponse(
                "Product successfully created",
                HttpStatus.CREATED,
                articleResponse

        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<GeneralResponse> getProductById(@PathVariable UUID id) {
        ArticleResponse articleResponse = articleService.getArticleById(id);
        return buildResponse(
                "Product identified:",
                HttpStatus.OK,
                productResponse
        );
    }
}
