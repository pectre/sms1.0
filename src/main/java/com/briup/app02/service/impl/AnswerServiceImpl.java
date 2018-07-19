package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Answer;
import com.briup.app02.dao.AnswerMapper;
import com.briup.app02.dao.extend.AnswerVMMapper;
import com.briup.app02.service.IAnswerService;
import com.briup.app02.vm.AnswerVM;

@Service
public class AnswerServiceImpl implements IAnswerService {
	
	@Autowired
	private AnswerMapper answerMapper;
	@Autowired
	private AnswerVMMapper answerVMMapper;
	
	@Override
	public List<Answer> findAll() throws Exception {
		
		List<Answer> list=answerMapper.findAll();
		
		return list;
	}
	
	@Override
	public Answer findById(long id) throws Exception {
		
		 return answerMapper.findById(id);
	}
	
	@Override
	public void updateById(Answer answer) throws Exception {
		
		answerMapper.updateById(answer);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		answerMapper.deleteById(id);
	}
	
	@Override
	public void save(Answer answer) throws Exception {
		
		answerMapper.save(answer);
	}

	@Override
	public List<AnswerVM> findAllAnswerVM() throws Exception {
		List<AnswerVM> list=answerVMMapper.findAllAnswerVM();
		return list;
	}
}
