package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Clazz;
import com.briup.app02.vm.ClazzVM;

public interface IClazzService {
	List<ClazzVM> findAllClazzVM() throws Exception;
	
	ClazzVM findById(long id) throws Exception;
	
	void updateById(Clazz clazz) throws Exception;
	
	void deleteById(long id) throws Exception;
	
	void save(Clazz clazz) throws Exception;
}
