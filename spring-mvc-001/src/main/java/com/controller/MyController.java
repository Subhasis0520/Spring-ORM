package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MyController {

	@RequestMapping("/search")
	public RedirectView search(@RequestParam String query) {
		RedirectView rv = new RedirectView();
		String path = "https://www.google.com/search?q="+query;
		rv.setUrl(path);
		return rv;
	}
}
