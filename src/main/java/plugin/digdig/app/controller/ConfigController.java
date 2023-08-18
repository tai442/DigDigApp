package plugin.digdig.app.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import plugin.digdig.app.mapper.data.GameConfig;
import plugin.digdig.app.service.ConfigService;

@RestController
public class ConfigController {

  public final ConfigService service;

  public ConfigController(ConfigService service) {
    this.service = service;
  }

  @RequestMapping(value = "/configList", method = RequestMethod.GET)
  public List<GameConfig> configList() {
    return service.searchConfig();
  }
}
