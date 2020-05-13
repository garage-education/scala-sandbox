package com.gability.scala

/**
 * The main object for our application.
 */
object Main extends App {

  /**
   * This function counts the words in a given string.
   *
   * @param str represents the input string we are going t count its words.
   * @return integer representing the word count in the input string.
   */
  def wordCount(str: String): Int = {
    str match {
      case emp if isEmpty(emp) => 0
      case x => x.split("\\W+").length
    }
  }

  /**
   * This function checks if the input string is not null or empty.
   *
   * @param str represents the input string we are going to check.
   * @return true if the input string is null or empty otherwise returns false.
   */
  def isEmpty(str: String) = str == null || str.trim.isEmpty

  println(wordCount("Moustafa Alaa"))
}