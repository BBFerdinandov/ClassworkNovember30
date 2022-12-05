package io.datajek.springmvc;
import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


    @Controller
    @RequestMapping("/player")
    public class AthleteController {
        @RequestMapping("/showPlayerForm")
        public String showForm(Model model) {

            return "add-player-form";
        }
        @RequestMapping("/processPlayerForm")
        public static String processForm(@ModelAttribute("athlete") Athlete myAthlete) {

            //if(result.hasErrors())
               return "add-player-form";
           //else
            //return "player-confirmation";
        }
    }
