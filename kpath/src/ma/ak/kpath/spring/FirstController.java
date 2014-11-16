package ma.ak.kpath.spring;

import ma.ak.kpath.base.Site;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.WebRequest;

@Controller
public class FirstController {
	
    @RequestMapping(value="/site")
    @ResponseBody
    public String submitJson(WebRequest request, Model model) {       
            
       Site site = new Site();
       
       site.setName("Got: "+request.getParameter("name"));
       Gson gson = new Gson();
       String json = gson.toJson(site);
       System.out.println("\n\n*****************\n\n"+json+"\n\n"); 
       return json;
   }


}
