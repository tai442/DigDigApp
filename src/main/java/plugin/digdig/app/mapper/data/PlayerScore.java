package plugin.digdig.app.mapper.data;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class PlayerScore {
  private int id;
  private String playerName;
  private int score;
  private LocalDateTime registeredAt;
}


