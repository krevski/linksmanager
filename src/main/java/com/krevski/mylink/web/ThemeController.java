package com.krevski.mylink.web;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.krevski.mylink.entities.Category;
import com.krevski.mylink.entities.Link;
import com.krevski.mylink.entities.Theme;
import com.krevski.mylink.services.CategoryService;
import com.krevski.mylink.services.LinkService;
import com.krevski.mylink.services.ThemeService;

@Controller
@RequestMapping("/links")
public class ThemeController {

	private List<Theme> list = null;
	private List<Link> listOfLinks = null;
	private List<Category> listOfCategory = null;
	private List<Theme> listOfTheme = null;
	private List<Theme> listOfThemes = null;

	@Autowired
	private LinkService linkService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ThemeService themeService;

	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String showMain(ModelMap model) {
		listOfLinks = linkService.getAllLinks();
		model.addAttribute("linkList", listOfLinks);
		return "main";
	}
	
	@RequestMapping(value = "/listOfThemes", method = RequestMethod.GET)
	public String showListThemes(ModelMap model) {
		listOfThemes = themeService.findAll();
		model.addAttribute("themeList", listOfThemes);
		System.out.println("im here");
		return "listOfThemes";
	}
	
	@RequestMapping(value = "/listOfCategories", method = RequestMethod.GET)
	public String showListCategory(ModelMap model) {
		listOfCategory = categoryService.findAll();
		model.addAttribute("categoryList", listOfCategory);
		return "listOfCategory";
	}
	
	@ModelAttribute("allCategory")
	public List<Category> populateCategory() 
    {
		listOfCategory = categoryService.findAll();
        return listOfCategory;
    }
	
	@ModelAttribute("allTheme")
	public List<Theme> populateTheme() 
    {
		listOfTheme =  themeService.findAll();
        return listOfTheme;
    }

//	@RequestMapping(value = "/listOfCategory", method = RequestMethod.GET)
//	public String showListClassification(ModelMap model) {
//		listOfCategory = categoryService.findAll();
//		model.addAttribute("categoryList", listOfCategory);
//		return "listOfClassifications";
//	}
	
	@RequestMapping(value = "/newLink", method = RequestMethod.GET)
	public String newLink(ModelMap model) {
		model.addAttribute("link", new Link());
		return "newLink";
	}
	
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	public String showList(ModelMap model) {
//		list = service.findAll();
//		model.addAttribute("themeList", list);
//		return "listOfThemes";
//	}
	
//	@RequestMapping(value = "/link", method = RequestMethod.GET)
//	public String showLinks(ModelMap model) {
//		listOfLinks = linkService.getAllLinks();
//		model.addAttribute("linkList", listOfLinks);
//		return "listOfThemes";
//	}
//
	@RequestMapping(value = "/newTheme", method = RequestMethod.GET)
	public String newTheme(ModelMap model) {
		model.addAttribute("theme", new Theme());
		return "newTheme";
	}

	@RequestMapping(value = "/addTheme", method = RequestMethod.POST)
	public String addTheme(@ModelAttribute("theme") Theme theme, ModelMap model) {
		themeService.save(theme);
		list = themeService.findAll();
		model.addAttribute("themeList", list);
		return "listOfThemes";
	}
	
	@RequestMapping(value = "/newCategory", method = RequestMethod.GET)
	public String newCategory(ModelMap model) {
		model.addAttribute("category", new Category());
		return "newCategory";
	}
	@RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category, ModelMap model) {
		categoryService.save(category);
		listOfCategory = categoryService.findAll();
		model.addAttribute("categoryList", listOfCategory);
		return "listOfCategory";
		}
	
	@RequestMapping(value = "category/{categoryId}", method = RequestMethod.GET)
	public String editCategory(@PathVariable Integer categoryId, ModelMap model) {
		int id = Integer.valueOf(categoryId);
		Category category = categoryService.findById(id);
		model.addAttribute("category", category);
		return "newCategory";
	}

	@RequestMapping(value = "theme/{themeId}", method = RequestMethod.GET)
	public String editTheme(@PathVariable Integer themeId, ModelMap model) {
		int id = Integer.valueOf(themeId);
		Theme theme = themeService.findById(id);
		model.addAttribute("theme", theme);
		return "newTheme";
	}
	
	@RequestMapping(value = "/addLink", method = RequestMethod.POST)
	public String addLink( @ModelAttribute("link") Link link,  ModelMap model) {
//	@valid	if (bindingResult.hasErrors()) {
//			return "newLink";
//		}
//		System.out.println(link.getCategory());
		LocalDate time = LocalDate.now();
		link.setDateofadd(Date.valueOf(time));
		link.setReadnotread("T");
		System.out.println(link);
		linkService.save(link);
		listOfLinks = linkService.getAllLinks();
		model.addAttribute("linkList", listOfLinks);
		return "main";
	}
	
	@RequestMapping(value = "/{linkId}", method = RequestMethod.GET)
	public String editLink(@PathVariable Integer linkId, ModelMap model) {
	     int id = Integer.valueOf(linkId);
	     Link link = linkService.findById(id);
	     System.out.println(link);
	     model.addAttribute("link", link);
	     return "newLink";
	}
	
	@RequestMapping(value = "delete/{linkId}", method = RequestMethod.GET)
	public String deleteLink(@PathVariable String linkId, ModelMap model) {
		int id = Integer.valueOf(linkId);
		linkService.remove(id);
		listOfLinks = linkService.getAllLinks();
		model.addAttribute("linkList", listOfLinks);
		return "redirect:../main";
	}
	
//	@RequestMapping(value = "category/{categoryId}", method = RequestMethod.GET)
//	public String deleteCategory(@PathVariable String categoryId, ModelMap model) {
//		int id = Integer.valueOf(categoryId);
//		categoryService.remove(id);
//		listOfCategory = categoryService.findAll();
//		model.addAttribute("categoryList", listOfCategory);
//		return "redirect:/listOfCategory";
//	}

//	 @RequestMapping(value = "/redirect", method = RequestMethod.GET)
//	    public void method(HttpServletResponse httpServletResponse) {
//	        httpServletResponse.setHeader("Location", "http://localhost:8080/SpringMyLink2/links/");
//	    }
//	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		// SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
}
