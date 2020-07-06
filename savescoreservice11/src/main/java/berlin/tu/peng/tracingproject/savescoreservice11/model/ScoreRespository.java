package berlin.tu.peng.tracingproject.savescoreservice11.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRespository extends JpaRepository<ScoreModel, String> {
    ScoreModel findFirstByUserName(String username);
}
