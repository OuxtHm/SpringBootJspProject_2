package com.sist.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sist.web.service.MusicService;
import com.sist.web.vo.MusicVO;

/*
 * JSP === MVC === SpringFramework === SpringBoot
 * JavaScript === JQuery === Vue === React === Next
 */

@Controller
public class MusicController {
	@GetMapping("/")
	public String music_init()
	{
		return "main";
	}

    
}
