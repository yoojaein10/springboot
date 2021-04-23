package com.example.boardex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boardex.dao.ArticleDao;
import com.example.boardex.dto.Article;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	ArticleDao articleDao;
	
	public List<Article> getList() {
		
		return articleDao.getList();
		
	}

}
