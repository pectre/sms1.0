package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Option;
import com.briup.app02.bean.Question;
import com.briup.app02.dao.OptionMapper;
import com.briup.app02.dao.QuestionMapper;
import com.briup.app02.dao.extend.QuestionVMMapper;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.vm.QuestionVM;

@Service
public class QuestionServiceImpl implements IQuestionService {
	
	@Autowired
	private QuestionMapper questionMapper;
	
	@Autowired
	private QuestionVMMapper questionVMMapper;
	
	@Autowired
	private OptionMapper optionMapper;
	
	@Override
	public List<Question> findAll() throws Exception {
		
		List<Question> list=questionMapper.findAll();
		
		return list;
	}
	
	@Override
	public Question findById(long id) throws Exception {
		
		 return questionMapper.findById(id);
	}
	
	@Override
	public void updateById(Question question) throws Exception {
		
		questionMapper.updateById(question);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		questionMapper.deleteById(id);
	}

	@Override
	public List<QuestionVM> findAllQuestionVM() throws Exception {
		List<QuestionVM> list=questionVMMapper.findAllQuestionVM();
		return list;
	}

	@Override
	public void saveQuestion(QuestionVM questionVM) throws Exception {
		/*
		 * 1.questionvm和option从questionvm中剥离
		 * 2.question list<option>list
		 * 3.questionmapper.save(question)
		 * 4.baocun question id
		 * 5.
		 */
		Long questionId=questionVM.getId();
		String questionName=questionVM.getName();
		String questionType=questionVM.getQuestiontype();
		Question question=new Question(questionId,questionName,questionType);
		List<Option> options=questionVM.getOptions();
		questionMapper.save(question);
		Long question_id=question.getId();
		for(Option option : options){
			option.setQuestion_id(question_id);
			optionMapper.save(option);
		}
	}
}
