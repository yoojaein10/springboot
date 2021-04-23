package com.example.boardex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.boardex.dto.Article;
import com.example.boardex.service.ArticleService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j // log info를 가능하기위해서 
public class ArticleController {
	@Autowired
	ArticleService articleService;

	@RequestMapping("/article/list")
	public String showList(Model aModel) {
		List<Article> list = articleService.getList();
		
		aModel.addAttribute("list", list);
		// request.setAttribute("list", list); 와 똑같은 표현

		
		return "article/list";
	}
}
