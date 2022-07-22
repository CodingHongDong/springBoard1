package com.webjjang.board.mapper;

import java.util.List;

import com.webjjang.board.vo.BoardVO;

import net.webjjang.util.PageObject;

public interface BoardMapper {

	// 게시판 리스트
	public List<BoardVO> list(PageObject pageObject);

	//전체 데이터를 가져오는 메서드
	public Integer getCount();
	// 게시판 글보기
	public Object view(int no);
	// 게시판 글쓰기
	public int write(BoardVO vo);
	// 게시판 조회수 1 증가
	public int increase(Long no);
}
