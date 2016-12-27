package oauth.facebook.model.repo;

import oauth.facebook.model.entity.OAuthAccessToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OAuthAccessTokenRepository extends CrudRepository<OAuthAccessToken, String> {
}
