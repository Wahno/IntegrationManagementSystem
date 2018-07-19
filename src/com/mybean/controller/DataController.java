package com.mybean.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

//表格导出导入
import jxl.Workbook;
import jxl.write.*;

@Controller
@RequestMapping("")
public class DataController {
	
	
	
	@RequestMapping("Data")
	public ModelAndView DataMessage(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("DataJsp/Data");//返回到的JSP文件名
		return mav;
	}
	
	@RequestMapping("DataBackup")
	public ModelAndView DataBackUp(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("DataJsp/DataBackup");//返回到的JSP文件名
		return mav;
	}
	@RequestMapping("DataRestore")
	public ModelAndView DataRestore(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("DataJsp/DataRestore");//返回到的JSP文件名
		return mav;
	}
	@RequestMapping("DataRestoreFile")
	public ModelAndView DataRestoreFile(MultipartFile uploadFile,HttpSession session) throws Exception{
		ModelAndView mav = new ModelAndView();
		if(uploadFile.getSize()>0){
			String path = session.getServletContext().getRealPath("/dataFile");//文件上传路径
	        String fileName = uploadFile.getOriginalFilename();
	        System.out.println("DataRestoreFile:"+path);
	        File dir = new File(path ,fileName);        
	        if(!dir.exists()){
	            dir.mkdirs();
	        }
	        uploadFile.transferTo(dir);
	        mav.addObject("message", "上传成功！");
			mav.addObject("nextPage", "DataRestoreFile");//返回
			mav.setViewName("MessagePage");//中继界面
			return mav;
		}
		else{
			mav.addObject("message", "上传失败！");
			mav.addObject("nextPage", "DataRestoreFile");//返回
			mav.setViewName("MessagePage");//中继界面
			return mav;
		}
	}


}
