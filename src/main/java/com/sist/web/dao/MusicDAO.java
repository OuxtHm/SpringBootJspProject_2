package com.sist.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.sist.web.mapper.*;
import com.sist.web.vo.*;

@Repository
public class MusicDAO {
	@Autowired
	private MusicMapper mapper;
	
	public List<MusicVO> musicListData(Map map)
	{
		return mapper.musicListData(map);
	}
	public int musicTotalPage()
	{
		return mapper.musicTotalPage();
	}
}
