package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Question;
import com.briup.app02.vm.QuestionVM;

public interface IQuestionService {
	
	void saveQuestion(QuestionVM questionVM) throws Exception;
	
	List<QuestionVM> findAllQuestionVM() throws Exception;
	
	List<Question> findAll() throws Exception;
	
	Question findById(long id) throws Exception;
	
	void updateById(Question question) throws Exception;
	
	void deleteById(long id) throws Exception;
	
}
