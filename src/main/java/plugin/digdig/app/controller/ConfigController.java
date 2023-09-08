package plugin.digdig.app.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import plugin.digdig.app.mapper.data.GameConfig;
import plugin.digdig.app.mapper.data.SpawnOre;
import plugin.digdig.app.service.ConfigService;

@RestController
public class ConfigController {

  public final ConfigService service;

  public ConfigController(ConfigService service) {
    this.service = service;
  }

  @GetMapping(value = "/configList")
  public List<GameConfig> searchConfigList() {
    return service.searchConfigList();
  }

  @GetMapping(value = "/spawnOreList")
  public List<SpawnOre> spawnOreList() {
    return service.searchSpawnOreList();
  }

  @PostMapping(value = "updateGameTime")
  public ResponseEntity<List<GameConfig>> updateGameConfig(@RequestBody GameConfig config) {
    List<GameConfig> updatedGameConfigList = service.updateGameConfig(config);
    return new ResponseEntity<>(updatedGameConfigList, HttpStatus.OK);
  }

  @PostMapping(value = "/updateOreScore")
  public ResponseEntity<List<SpawnOre>> updateOreScore(@RequestBody SpawnOre spawnOre) {
    List<SpawnOre> updatedSpawnOreList = service.updateOreScore(spawnOre);
    return new ResponseEntity<>(updatedSpawnOreList, HttpStatus.OK);
  }
}
