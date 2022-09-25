package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "storeProduct",method = RequestMethod.POST)
	public ModelAndView storeProduct(HttpServletRequest req, Product product) {
		int pid = Integer.parseInt(req.getParameter("pid"));
		String pname = req.getParameter("pname");
		float price = Float.parseFloat(req.getParameter("price"));
		String ulr = req.getParameter("url");
		
		product.setPid(pid);
		product.setPname(pname);
		product.setPrice(price);
		
		
		String result = productService.storeProduct(product);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("storeProduct.jsp");
		return mav;
	}
	@RequestMapping(value = "updateProduct",method = RequestMethod.POST)
	public ModelAndView updateProduct(HttpServletRequest req, Product product) {
		int pid = Integer.parseInt(req.getParameter("pid"));
		float price = Float.parseFloat(req.getParameter("price"));
		String ulr = req.getParameter("url");
		
		product.setPid(pid);
		product.setPrice(price);
		
		
		String result = productService.updateProduct(product);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("updateProduct.jsp");
		return mav;
	}
	@RequestMapping(value = "searchProduct",method = RequestMethod.GET)
	public ModelAndView searchProduct(HttpServletRequest req) {
		int pid = Integer.parseInt(req.getParameter("pid"));
		
		String result = productService.searchProductById(pid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("searchProductById.jsp");
		return mav;
}
}
