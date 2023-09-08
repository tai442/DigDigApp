package plugin.digdig.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import plugin.digdig.app.mapper.GameConfigMapper;
import plugin.digdig.app.mapper.data.GameConfig;
import plugin.digdig.app.mapper.data.SpawnOre;

@Service
public class ConfigService {

  public final GameConfigMapper mapper;

  public ConfigService(GameConfigMapper mapper) {
    this.mapper = mapper;
  }

  public List<GameConfig> searchConfigList() {
    return mapper.selectConfigList();
  }

  public List<SpawnOre> searchSpawnOreList() {
    return mapper.selectSpawnOreList();
  }

  public List<GameConfig> updateGameConfig(GameConfig config) {
    mapper.updateGameTime(config);
    return mapper.selectConfigList();
  }

  public List<SpawnOre> updateOreScore(SpawnOre spawnOre) {
    mapper.updateOreScore(spawnOre);
    return mapper.selectSpawnOreList();
  }
}
