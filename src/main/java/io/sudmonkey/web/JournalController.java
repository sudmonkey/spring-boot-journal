package io.sudmonkey.web;

import io.sudmonkey.domain.JournalEntry;
import io.sudmonkey.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JournalController {
    @Autowired
    private JournalRepository repository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("journal", repository.findAll());

        return "index";
    }

    @RequestMapping(value = "/journal", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public @ResponseBody
    List<JournalEntry> getJournal() {
        return repository.findAll();
    }
}
