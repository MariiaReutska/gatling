
package com.testingperformance.scenarios

import com.testingperformance.requests.GetLimsTokenRequest
import io.gatling.core.Predef._

object GetLimsAuthTokenScenario {

  val getLimsAuthTokenScenario = scenario("Get Lims Auth Token Scenario Scenario")
                                .exec(GetLimsTokenRequest.get_token)
}
