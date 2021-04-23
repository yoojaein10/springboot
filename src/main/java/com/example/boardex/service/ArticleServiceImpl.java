package com.example.boardex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.boardex.dto.Article;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	public List<Article> getList() {
		
		Article article1 = new Article(1, "끝", "이제없음", "dbwodls00", "2021-04-20 10:10:10", "", "");
		Article article2 = new Article(2, "끝2", "이제없음2", "dbwodls00", "2021-04-20 10:10:11", "", "");
		Article article3 = new Article(3, "끝3", "이제없음3", "dbwodls00", "2021-04-20 10:10:12", "", "");
		
		List<Article> list = new ArrayList<>();
				
		list.add(article1);
		list.add(article2);
		list.add(article3);
		
		return list;
		
	}

}
