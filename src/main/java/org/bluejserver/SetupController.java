package org.bluejserver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SetupController
{
    @GetMapping("/setup/teacher")
    public String setupTeacher(Model model)
    {
        model.addAttribute("teacher", new Teacher());
        return "setupTeacher";
    }
    @PostMapping("/setup/teacher")
    public String setupTeacher(@ModelAttribute Teacher teacher, Model model)
    {
        model.addAttribute("teacher", teacher);
        return "result";
    }
}
