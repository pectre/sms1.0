package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Question;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.util.MsgResponse;
import com.briup.app02.vm.QuestionVM;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "问题相关接口")
@RestController
@RequestMapping("/Question")
public class QuestionController {
	@Autowired
	private IQuestionService questionService;
	
	@ApiOperation(value = "保存问题", notes = "保存问题的同时保存选项id不用保存")
	@PostMapping("saveQuestion")
	public MsgResponse saveQuestion(QuestionVM questionVM) {
		try {
			
			questionService.saveQuestion(questionVM);
			
			return MsgResponse.success("保存成功", null);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "查询所有问题", notes = "级联查询出属于该题目的选项")
	@GetMapping("findAllQuestionVM")
	public MsgResponse findAllQuestionVM() {
		try {
			List<QuestionVM> list = questionService.findAllQuestionVM();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@GetMapping("findAllQuestion")
	public MsgResponse findAllQuestion() {

		try {
			return MsgResponse.success("查找成功", questionService.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@GetMapping("findQuestionById")
	public MsgResponse findQuestionById(long id) {

		try {
			return MsgResponse.success("查找成功", questionService.findById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@PostMapping("updateQuestionById")
	public MsgResponse updateQuestionById(Question question) {

		try {
			questionService.updateById(question);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@GetMapping("deleteQuestionById")
	public MsgResponse deleteQuestionById(long id) {

		try {
			questionService.deleteById(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
