package com.lee.exam.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lee.exam.demo.vo.Article;

@Mapper
public interface ArticleRepository {
	public void writeArticle(@Param("title") String title, @Param("body") String body, @Param("memberId")int memberId, @Param("boardId")int boardId);

	public Article getForPrintArticle(@Param("id")int id);

	public List<Article> getForPrintArticles(@Param("boardId")int boardId, int limitStart, int limitTake);
	
	public int getLastInsertId();

	public void deleteArticle(@Param("id") int id);

	public void modifyArticle(int id, String title, String body);

	public int getArticlesCount(@Param("boardId")int boardId, String searchKeywordTypeCode, String searchKeyword);
}
