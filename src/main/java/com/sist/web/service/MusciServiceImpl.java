package com.sist.web.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.web.mapper.MusicMapper;
import com.sist.web.vo.MusicVO;

@Service
public class MusciServiceImpl implements MusicService{
	@Autowired
	private MusicMapper mMapper;
	
	@Override
	public List<MusicVO> musicListData(Map map) {
		return mMapper.musicListData(map);
	}
	
	@Override
	public int musicTotalPage() {
		return mMapper.musicTotalPage();
	}
}
