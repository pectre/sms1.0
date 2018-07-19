package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Answer;
import com.briup.app02.service.IAnswerService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/Answer")
public class AnswerController {
	@Autowired
	private IAnswerService answerService;
	
	@GetMapping("findAllAnswerVM")
	public MsgResponse findAllAnswerVM() {
		
		try {
			return MsgResponse.success("查找成功",answerService);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findAllAnswer")
	public MsgResponse findAllAnswer() {
		
		try {
			return MsgResponse.success("查找成功",answerService.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findAnswerById")
	public MsgResponse findAnswerById(long id) {
		
		try {
			return MsgResponse.success("查找成功",answerService.findById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateAnswerById")
	public MsgResponse updateAnswerById(Answer answer) {
			
		try {
			answerService.updateById(answer);
			return MsgResponse.success("更新成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteAnswerById")
	public MsgResponse deleteAnswerById(long id) {
		
		try {
			answerService.deleteById(id);
			return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveAnswer")
	public MsgResponse saveAnswer(Answer answer) {
		
		try {
			answerService.save(answer);
			return MsgResponse.success("保存成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
