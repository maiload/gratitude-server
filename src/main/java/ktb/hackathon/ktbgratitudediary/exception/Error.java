package ktb.hackathon.ktbgratitudediary.exception;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@ToString
@Getter
public enum Error {
    // 400
    INVALID_INPUT(HttpStatus.BAD_REQUEST.value(), 4000),

    // 401
    BLACKLIST_TOKEN(HttpStatus.UNAUTHORIZED.value(), 4010),
    BROKEN_TOKEN(HttpStatus.UNAUTHORIZED.value(), 4011),
    CANNOT_FIND_REFRESH_TOKEN_COOKIE(HttpStatus.UNAUTHORIZED.value(), 4012);

    private final int httpStatus;
    private final int detailCode;

    Error(int httpStatus, int detailCode) {
        this.httpStatus = httpStatus;
        this.detailCode = detailCode;
    }
}
