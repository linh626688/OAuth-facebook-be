package oauth.facebook.controller;

/**
 * Created by DangThanhLinh on 27/12/2016.
 */

import oauth.facebook.dto.AccessTokenDTO;
import oauth.facebook.dto.AccessTokenValidationResultDTO;
import oauth.facebook.service.FacebookAccessTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/oauth/facebook/access-token")
public class FacebookAccessTokenController {

    @Autowired
    private FacebookAccessTokenService tokenService;

    @PostMapping("/exchange")
    public AccessTokenValidationResultDTO exchange(@RequestBody AccessTokenDTO accessToken) {
        return tokenService.exchange(accessToken);
    }
}

