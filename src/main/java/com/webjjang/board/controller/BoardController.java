package com.webjjang.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webjjang.board.service.BoardService;

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
}
