package oauth.facebook.model.repo;

import oauth.facebook.model.entity.OAuthUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OAuthUserRepository extends CrudRepository<OAuthUser, String> {
}
