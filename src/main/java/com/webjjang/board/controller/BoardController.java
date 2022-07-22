package com.webjjang.board.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.webjjang.board.service.BoardService;
import com.webjjang.board.vo.BoardVO;

import lombok.extern.java.Log;
import net.webjjang.util.PageObject;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	// 자동 DI 적용 시키는 어노테이션 2가지 - Inject, Autowired
	@Autowired
	private BoardService service;
	
	@GetMapping("/list.do")
	// 실행할 메서드 만들기
	// model 안에 request가 있다. model에 데이터를 저장하면 request에 저장된다.
	public String list(PageObject pageObject, Model model) {
		System.out.println("BoardController.list()");
		model.addAttribute("list", service.list(pageObject));
		return "board/list";
	}
	
	// 게시판 글보기
	@GetMapping("/view.do")
	public String view(int no, Model model) {
		model.addAttribute("vo", service.view(no));
		return "board/view";
	}
	
	// 게시판 등록 폼 / write.do - get
	@GetMapping("/write.do")
	public String writeForm() {
		
		return "board/write";
	}
	
	// 게시판 등록 처리 / write.do - post
	@PostMapping("/write.do")
	public String write(BoardVO vo, int perPageNum, RedirectAttributes rtts) {
	
	// db에 데이터 저장하기
	service.write(vo);
	
	// addFlashAttribute() - 단 일회만 사용 가능한 정보 저장
	rtts.addFlashAttribute("msg", "게시판 글 등록 성공적으로 되었습니다.");
	
	return "redirect:list.do?perPageNum=" + perPageNum;
	}
	
	
	
}
