package com.Article.Article;

import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article>getAllArticle(){
        return articleService.getAllArticle();
    }

    @RequestMapping("/articles/{id}")
    public Article getArticles(@PathVariable String id){
        return articleService.getArticle(id);
    }

    @PostMapping("/articles")
    public void addArticle(@RequestBody Article article){
        articleService.addArticle(article);
    }

    @PutMapping("/articles/{id}")
    public  void updateArticles(@PathVariable String id,@RequestBody Article article){
        articleService.updateArticle(article,id);
    }
    @DeleteMapping("/articles/{id}")
    public void deleteArticles(@PathVariable String id){
        articleService.deleteArticle(id);
    }



}
