package com.harvestmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harvestmarket.entity.News;
import com.harvestmarket.repository.NewsRepository;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public News saveNews(News news) {
        return newsRepository.save(news);
    }
}