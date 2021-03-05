package I.Ronak.coronavirustracker.Controller;

import I.Ronak.coronavirustracker.Models.LocationStats;
import I.Ronak.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model)
    {
        List<LocationStats> all = coronaVirusDataService.getAllStats();
        model.addAttribute("locationStats", all);


        return "home";
    }



}
