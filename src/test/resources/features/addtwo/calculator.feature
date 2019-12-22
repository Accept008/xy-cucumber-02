Feature: Basic Add
  Scenario Outline: Addition
    Given x is <a> and y is <b>
    When  invoke add method
    Then the result is <result>
    Examples:
      |a|b|result|
      |1|1|2     |
      |2|3|5     |
      |3|4|7     |
      |4|5|10    |




#Feature: -> 功能
#  Scenario: -> 场景
#    Given  -> 假如
#    When -> 当
#    Then -> 然后
