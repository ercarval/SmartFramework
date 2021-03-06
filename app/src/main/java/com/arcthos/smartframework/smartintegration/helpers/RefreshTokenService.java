package com.arcthos.smartframework.smartintegration.helpers;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

/**
 * Created by Vinicius Damiati on 16-Oct-17.
 */

public interface RefreshTokenService {
    @POST("services/oauth2/token")
    Call<RefreshToken> getRefreshToken(
            @Field("grant_type") String grantType,
            @Field("client_id") String clientId,
            @Field("refresh_token") String refreshToken);
}
