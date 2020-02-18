@clickSearch
Feature: Search Jobs in Total Jobs website
Scenario Outline: List the related jobs for the search key

Given launch the chrome browser "http://www.totaljobs.com"
Then enter the jobtitle "<title>"
Then enter the postcode "<code>"
Then enter the locationtype "<locationtype>"
Then click on the search button

Examples:
		| title       | code | locationtype |
		|Test Analyst | E6 1JG | 20 |
		| Java Developer | N7 8RT | 30 |