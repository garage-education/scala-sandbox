package com.gability.scala

import org.scalatest._


class MainTest extends FunSuite {

  test("Test wordCount Function with input string") {
    val inputSentence = "Testing Word Count Func"
    assert(Main.wordCount(inputSentence) == 4)
  }

  test("Test wordCount Function with null input") {
    val inputSentence = null
    assert(Main.wordCount(inputSentence) == 0)
  }
}
