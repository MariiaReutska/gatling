package com.testingperformance.simulations

import com.testingperformance.config.Config
import com.testingperformance.scenarios.GetLimsAuthTokenScenario

import io.gatling.core.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Predef._     // required for Gatling HTTP DSL

class GetLimsAuthTokenSimulation extends Simulation {

  private val getLimsAuthToken = GetLimsAuthTokenScenario.getLimsAuthTokenScenario
    .inject(atOnceUsers(Config.users))

  setUp(getLimsAuthToken)

}
