package com.example.boardex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
	
//	public Article(int i, String string, String string2, String string3, String string4, String string5,
//			String string6) {
//		// TODO Auto-generated constructor stub
//	}
	
	public int id;
	public String Subject;
	public String Content;
	public String In_Userid;
	public String InDate;
	public String Up_Userid;
	public String UpDate;

}
