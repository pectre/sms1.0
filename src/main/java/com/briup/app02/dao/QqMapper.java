package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Qq;

public interface QqMapper {
	
	List<Qq> findAll();
	
	Qq findById(long id);
	
	void updateById(Qq qq);
	
	void deleteById(long id);
	
	void save(Qq qq);
}
