import models.Hero;
import models.Squad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;



public class App {
    static int definingHerokuPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }

    public static void main(String[] args) {
        port(definingHerokuPort());
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> foundSquad = Squad.getAll();
            model.put("squads", foundSquad);

            return new ModelAndView(model, "squads.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squads/list", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> squads = Squad.getAll();

            model.put("squads", squads);
            return new ModelAndView(model, "allsquads.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squads/:id", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            int idOfListToFind = Integer.parseInt(request.params("id"));
            Squad foundSquad = Squad.findById(idOfListToFind);
            Hero foundHero = Hero.findById(idOfListToFind);

            model.put("squad", foundSquad);
            model.put("hero", foundHero);

            return new ModelAndView(model, "squad-detail.hbs");
        }, new HandlebarsTemplateEngine());

    }


}
