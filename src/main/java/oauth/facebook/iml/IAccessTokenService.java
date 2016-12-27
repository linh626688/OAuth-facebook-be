package oauth.facebook.iml;

import oauth.facebook.dto.AccessTokenDTO;
import oauth.facebook.dto.AccessTokenValidationResultDTO;

import java.io.IOException;

/**
 * Created by DangThanhLinh on 27/12/2016.
 */
public interface IAccessTokenService {
    AccessTokenValidationResultDTO exchange(AccessTokenDTO accessToken) throws IOException;
}
