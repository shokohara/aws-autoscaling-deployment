package com.github.skohar.awsautoscalingdeployment

import scopt.OptionParser

object Main {

  val parser = new OptionParser[Config]("scopt") {
    opt[String]("load-balancer-name") required() action { (x, c) =>
      c.copy(loadBalancerName = x)
    }
    opt[Int]("leave") required() action { (x, c) =>
      c.copy(leave = x)
    }
    opt[Boolean]("dry-run") optional() action { (x, c) =>
      c.copy(dryRun = x)
    }
  }

  def main(args: Array[String]): Unit = {
    parser.parse(args, Config()) match {
      case Some(config) => Worker.detachAutoScalingGroup(config.loadBalancerName, config.leave, config.dryRun)
      case None =>
    }
  }
}
