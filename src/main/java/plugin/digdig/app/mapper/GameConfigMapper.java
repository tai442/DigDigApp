package plugin.digdig.app.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import plugin.digdig.app.mapper.data.GameConfig;
import plugin.digdig.app.mapper.data.SpawnOre;

@Mapper
public interface GameConfigMapper {

  @Select("select * from game_config order by id asc")
  List<GameConfig> selectConfigList();

  @Select("select * from spawn_ore order by id asc")
  List<SpawnOre> selectSpawnOreList();
  @Update("update game_config set game_time = #{gameTime} where id = #{id}")
  int updateGameTime(GameConfig config);

  @Update("update spawn_ore set score = #{score} where ore_type = #{oreType}")
  int updateOreScore(SpawnOre spawnOre);
}
