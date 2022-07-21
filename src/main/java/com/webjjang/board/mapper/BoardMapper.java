package com.webjjang.board.mapper;

import java.util.List;

import com.webjjang.board.vo.BoardVO;

import net.webjjang.util.PageObject;

public interface BoardMapper {

	// 게시판 리스트
	public List<BoardVO> list(PageObject pageObject);
}
