package com.testingperformance.config

object Config {
  val app_url = "http://example-app.com"
  val mr2_app_url = "https://mr2.qa.foundationmedicine.com"

  val users = Integer.getInteger("users", 100).toInt;
  val rampUp = Integer.getInteger("rampup", 1).toInt;
  val throughput = Integer.getInteger("throughput", 10).toInt;
}
