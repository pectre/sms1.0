package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Clazz;
import com.briup.app02.service.IClazzService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/Clazz")
public class ClazzController {
	@Autowired
	private IClazzService clazzService;
	
	@GetMapping("findAllClazzvm")
	public MsgResponse findAllClazzvm() {
		
		try {
			return MsgResponse.success("查找成功",clazzService.findAllClazzVM());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findClazzById")
	public MsgResponse findClazzById(long id) {
		
		try {
			return MsgResponse.success("查找成功",clazzService.findById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateClazzById")
	public MsgResponse updateClazzById(Clazz clazz) {
			
		try {
			clazzService.updateById(clazz);
			return MsgResponse.success("更新成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteClazzById")
	public MsgResponse deleteClazzById(long id) {
		
		try {
			clazzService.deleteById(id);
			return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveClazz")
	public MsgResponse saveClazz(Clazz clazz) {
		
		try {
			clazzService.save(clazz);
			return MsgResponse.success("保存成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
