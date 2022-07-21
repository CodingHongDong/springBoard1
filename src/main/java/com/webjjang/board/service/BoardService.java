package com.webjjang.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.webjjang.board.mapper.BoardMapper;
import com.webjjang.board.vo.BoardVO;

import net.webjjang.util.PageObject;

@Service
public class BoardService {

	@Inject
	private BoardMapper mapper;
	
	public List<BoardVO> list(PageObject pageObject) {
		return mapper.list(pageObject);
	}
	
}
