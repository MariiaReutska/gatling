package com.testingperformance.requests

import com.testingperformance.config.Config
import io.gatling.core.Predef._
import io.gatling.http.Predef._ // required for Gatling HTTP DSL

object GetLimsTokenRequest {

  val get_token = http("RequestName").get(Config.mr2_app_url + "/api/lims2AuthToken")
    .check(status is 200)
    .check(jsonPath("$..token").saveAs("token"))
}
