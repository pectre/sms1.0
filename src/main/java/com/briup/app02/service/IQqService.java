package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Qq;
import com.briup.app02.vm.QqVM;

public interface IQqService {
	List<QqVM> findAllQqVM() throws Exception;
	
	List<Qq> findAll() throws Exception;
	
	Qq findById(long id) throws Exception;
	
	void updateById(Qq qq) throws Exception;
	
	void deleteById(long id) throws Exception;
	
	void save(Qq qq) throws Exception;
}
