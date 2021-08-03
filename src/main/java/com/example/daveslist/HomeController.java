package com.example.daveslist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeController {

    public static long idCounter = 0;

    ArrayList<List> allLists = new ArrayList<>();


    @GetMapping("/")
    public String loadHomepage(){
        return "home";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }


    @RequestMapping("/addlist")
    public String showAddlist(Model model){
        List newlist = new List();
        idSetter(newlist);
        model.addAttribute("list", newlist);
        return "addlist";
    }


    @PostMapping("/list")
    public String loadlist(@Valid List list, BindingResult result){
        if (result.hasErrors()){
            return "addlist";
        }else {
            allLists.add(list);
            return "list";
        }
    }

    @RequestMapping("/list/{id}")
    public String loadDetail(@PathVariable("id") long id, Model model){
        for (List list: allLists){
            if(id == list.getId()){
                model.addAttribute("list", list);
            }
        }
        return "list";
    }


    @RequestMapping("/allLists")
    public String showAllLists(Model model){
        model.addAttribute("allLists", allLists );
        return "allLists";
    }

    @RequestMapping("/update/{id}")
    public String updateList(@PathVariable("id") long id, Model model){
        for (List list: allLists){
            if(id == list.getId()){
                allLists.remove(list);
                model.addAttribute("list", list);
                break;
            }
        }
        return "addlist";
    }

    @RequestMapping("/detail/{id}")
    public String showDetail(@PathVariable("id") long id, Model model){
        for (List list: allLists){
            if(id == list.getId()){
                model.addAttribute("list", list);
                break;
            }
        }
        return "detail";
    }

    public void idSetter(List list){
        idCounter += 1;
        list.setId(idCounter);
    }


}
