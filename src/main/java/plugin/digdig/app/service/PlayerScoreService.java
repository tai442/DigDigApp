package plugin.digdig.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import plugin.digdig.app.mapper.PlayerScoreMapper;
import plugin.digdig.app.mapper.data.PlayerScore;

@Service
public class PlayerScoreService {

  private final PlayerScoreMapper mapper;

  public PlayerScoreService(PlayerScoreMapper mapper) {
    this.mapper = mapper;
  }

  public List<PlayerScore> searchPlayerScoreList() {
    return mapper.selectPlayerScoreList();
  }
}
