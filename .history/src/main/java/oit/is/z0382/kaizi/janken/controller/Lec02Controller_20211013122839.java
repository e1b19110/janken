package oit.is.z0382.kaizi.janken.controller;

import java.security.Principal;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z0382.kaizi.janken.model.JankenCpu;
import oit.is.z0382.kaizi.janken.model.Entry;




@Controller
@RequestMapping("/lec02")
public class Lec02Controller {
  @Autowired
  private Room room;


  @GetMapping
  public String lec02() {
    return "lec02.html";
  }




/**
   *
   *
   * @param name
   * @param model
   * @return 
   */
  @PostMapping
  public String lec02(@RequestParam String name, ModelMap model) {
    model.addAttribute("nameResult", name);
    return "lec02.html";
  }


  @GetMapping("gu")
  public String gu(ModelMap model) {
   String Hand="グー";
   String hand="";
   String moji="";
    model.addAttribute("YouResult", Hand);
    JankenCpu X = new JankenCpu(1);
    int cpu=X.getcpu();
    if(cpu==1){hand="グー";}
    else if(cpu==0){hand="チョキ";}
    else if(cpu==-1){hand="パー";}
    model.addAttribute("CpuResult", hand);
    int result=X.getresult();
    if(result==1){moji="win";}
    else if(result==0){moji="drow";}
    else if(result==-1){moji="lose";}
    model.addAttribute("jankenResult", moji);
    return "lec02.html";
  }


  
  @GetMapping("ch")
  public String ch(ModelMap model) {
  String  Hand="チョキ";
  String hand="";
  String moji="";
   model.addAttribute("YouResult", Hand);
   JankenCpu X = new JankenCpu(0);
   int cpu=X.getcpu();
   if(cpu==1){hand="グー";}
   else if(cpu==0){hand="チョキ";}
   else if(cpu==-1){hand="パー";}
   model.addAttribute("CpuResult", hand);
   int result=X.getresult();
   if(result==1){moji="win";}
   else if(result==0){moji="drow";}
   else if(result==-1){moji="lose";}
   model.addAttribute("jankenResult", moji);
   return "lec02.html";
  }



  @GetMapping("pa")
  public String pa(ModelMap model) {
  String  Hand="パー";
  String hand="";
  String moji="";
   model.addAttribute("YouResult", Hand);
   JankenCpu X = new JankenCpu(-1);
   int cpu=X.getcpu();
   if(cpu==1){hand="グー";}
   else if(cpu==0){hand="チョキ";}
   else if(cpu==-1){hand="パー";}
   model.addAttribute("CpuResult", hand);
   int result=X.getresult();
   if(result==1){moji="win";}
   else if(result==0){moji="drow";}
   else if(result==-1){moji="lose";}
   model.addAttribute("jankenResult", moji);
   return "lec02.html";
  }

  @GetMapping("entry")
  public String entry(Principal prin, ModelMap model) {
    String loginUser = prin.getName();
    this.room.addUser(loginUser);
    model.addAttribute("room", this.room);

    return "lec02.html";
  }
 

  }
