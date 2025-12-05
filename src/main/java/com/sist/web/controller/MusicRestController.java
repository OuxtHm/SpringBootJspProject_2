package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.sist.web.vo.*;
import com.sist.web.service.*;

@RestController
public class MusicRestController {
	@Autowired
	private MusicService service;
	
	@GetMapping("/list_vue")
	public Map music_list_vue(@RequestParam(name = "page", required = false) int page)
	{
		Map map = new HashMap();
		
		int rowSize = 12;
		int start = (rowSize * page) - (rowSize - 1);
		int end = rowSize * page;
		
		map.put("start", start);
		map.put("end", end);
		
		List<MusicVO> list = service.musicListData(map);
		int totalpage = service.musicTotalPage();
		
		final int BLOCK = 10;
		
		int startPage = ((page - BLOCK) / BLOCK * BLOCK) + 1;
		int endPage = ((page - BLOCK) / BLOCK * BLOCK) + BLOCK;
		
		if(endPage > totalpage)
			endPage = totalpage;
		
		map = new HashMap();
		map.put("list", list);
		map.put("startPage", startPage);
		map.put("endPage", endPage);
		map.put("totalPage", totalpage);
		map.put("curpage", page);
		
		return map;
	}
}
