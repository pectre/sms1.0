package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Clazz;
import com.briup.app02.dao.ClazzMapper;
import com.briup.app02.dao.extend.ClazzVMMapper;
import com.briup.app02.service.IClazzService;
import com.briup.app02.vm.ClazzVM;

@Service
public class ClazzServiceImpl implements IClazzService {
	
	@Autowired
	private ClazzMapper clazzMapper;
	@Autowired
	private ClazzVMMapper clazzVMMapper;
	
	@Override
	public List<ClazzVM> findAllClazzVM() throws Exception {
		
		List<ClazzVM> list=clazzVMMapper.findAllClazzVM();
		
		return list;
	}
	
	@Override
	public ClazzVM findById(long id) throws Exception {
		
		 return clazzVMMapper.findClazzVMById(id);
	}
	
	@Override
	public void updateById(Clazz clazz) throws Exception {
		
		clazzMapper.updateById(clazz);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		clazzMapper.deleteById(id);
	}
	
	@Override
	public void save(Clazz clazz) throws Exception {
		
		clazzMapper.save(clazz);
	}
}
