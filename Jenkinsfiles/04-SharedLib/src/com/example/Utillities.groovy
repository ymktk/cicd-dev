package com.example

class Utilities implements Serializable {
  def steps
  def version

  Utilities(steps, version) {
    this.steps = steps
    this.version = version
  }

  def checkout() {
    this.steps.stage("checkout") {
      this.steps.sh "ls -l"
    }
  }

  def compile() {
    this.steps.stage("compile") {
      this.steps.echo "compile " +  version
    }
  }

  def deploy() {
    this.steps.stage("deploy") {
      this.steps.echo "deploy"
    }
  }

  def test() {
    this.steps.stage("test") {
      this.steps.echo "test"
    }
  }
}
