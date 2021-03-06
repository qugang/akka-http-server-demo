package com.zq.httpServer

import com.softwaremill.session.{SessionConfig, SessionManager}


object TestData {
  val sessionConfig: SessionConfig = SessionConfig.default("c05ll3lesrinf39t7mc5h6un6r0c69lgfno69dsak3vabeqamouq4328cuaekros401ajdpkh60rrtpd8ro24rbuqmgtnd1ebag6ljnb65i8a55d482ok7o0nch0bfbe")
  implicit val manager: SessionManager[Map[String, String]] = new SessionManager[Map[String, String]](sessionConfig)

  type SMan = SessionManager[Map[String, String]]

  val sessionConfig_expires60: SessionConfig = sessionConfig.copy(sessionMaxAgeSeconds = Some(60))
  val manager_expires60_fixedTime = new SessionManager[Map[String, String]](sessionConfig_expires60) {
    override def nowMillis: Long = 3028L * 1000L
  }
  val manager_expires60_fixedTime_plus30s = new SessionManager[Map[String, String]](sessionConfig_expires60) {
    override def nowMillis: Long = (3028L + 30L) * 1000L
  }
  val manager_expires60_fixedTime_plus70s = new SessionManager[Map[String, String]](sessionConfig_expires60) {
    override def nowMillis: Long = (3028L + 70L) * 1000L
  }
}
