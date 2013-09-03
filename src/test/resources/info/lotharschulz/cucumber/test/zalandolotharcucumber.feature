Feature: lothars cucumber test
    As a user
    I want a sample cucumber project
    that I can play around with cucumber and gherkin

    Background:
        Given I have MyString

    Scenario: add prefix to String
        Given I have a MyString with " my string "
        When I add the prefix "this is a prefix "
        Then prefix should be added at the start position of MyString and the result is "this is a prefix _ my string "

    Scenario: add suffix to String
        Given I have a MyString with "Another sample text"
        When I add the suffix "got a suffix"
        Then suffix should be added at the end position of MyString and the result is "Another sample text_got a suffix"
        When I add again the suffix "foo bla fasel"
        Then suffix should be added and the result is not "foo bla fasel"

    Scenario: Print my shopping list
        The list should be printed in alphabetical order of the item names

        Given a book list:
          | key | title    | pages | isbnNumber |
          |   3 | 50Shades |   200 | 123456     |
          |   2 | Love     |   111 | 654321     |
          |   6 | eternity |    50 | asd456     |
        When I print that list
        Then it should look like:
          """
          | 3 | 50Shades | 200 | 123456 |
          | 2 | Love | 111 | 654321 |
          | 6 | eternity | 50 | asd456 |

          """