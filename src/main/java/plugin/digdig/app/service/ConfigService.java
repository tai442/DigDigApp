package plugin.digdig.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import plugin.digdig.app.mapper.GameConfigMapper;
import plugin.digdig.app.mapper.data.GameConfig;

@Service
public class ConfigService {

  public final GameConfigMapper mapper;

  public ConfigService(GameConfigMapper mapper) {
    this.mapper = mapper;
  }

  public List<GameConfig> searchConfig() {
    return mapper.selectConfigList();
  }
}
