package io.sudmonkey.web;

import io.sudmonkey.domain.JournalEntry;
import io.sudmonkey.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class JournalController {
    private static final String VIEW_INDEX = "index";

    @Autowired
    private JournalRepository repository;


    @RequestMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName(VIEW_INDEX);
        modelAndView.addObject("journal", repository.findAll());

        return modelAndView;
    }

}
