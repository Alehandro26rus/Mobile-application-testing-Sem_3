package autoTest.accuweather.alarm;

import autoTest.accuweather.AbstractAccuweatherTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class FifteenDaysOfWeatherAlarmsTest extends AbstractAccuweatherTest {


    @Test
    void getFifteenDaysOfWeatherAlarms() {

        given()
                .when()
                .get(getBaseUrl()+"/alarms/v1/15day//290421" +
                        "apikey=" +getApiKey())
                .then()
                .statusCode(401)
                .time(lessThan(2000L))
                .statusLine("HTTP/1.1 401 Unauthorized");
    }
}
