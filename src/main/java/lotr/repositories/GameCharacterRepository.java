package lotr.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import lotr.entities.GameCharacter;


@RepositoryRestResource(collectionResourceRel = "gamecharacter", path = "gamecharacter")
public interface GameCharacterRepository extends PagingAndSortingRepository<GameCharacter, Long> {

	List<GameCharacter> findByCharacterClass(@Param("characterclass") String characterClass);

}
