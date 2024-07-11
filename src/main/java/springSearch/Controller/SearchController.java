package springSearch.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/searchKey")
    public RedirectView search(@RequestParam("querybox") String query) {
        RedirectView view = new RedirectView();
        String url = "https://www.google.com/search?q=" + query;
        view.setUrl(url);
        return view;
    }
}
