Cashier System
=======================

Table of Contents
-----------------

- [Intro](#intro)
- [Dependencies](#dependencies)
- [Requirements](#requirements)
- [Test Coverage](#test-coverage)

Intro
-------------
Simple test coverage for cart checkout implementation proposition

Dependencies
-------------

- Java 14
- Maven
- TestNG 7+
- Cucumber 7+

Requirements
---------------
Main business rules for the order checkout

- FreeRule (buy N get N free)
- ReducedPriceRule (buy more than N pay a different price)
- FractionPriceRule (buy more than N, pay a percentage of the original price)

##### Products
Products are loaded via yaml file using SnakeYaml on the class ProductImpl

##### Rule
The rules are also read via YAML file. #TBD

##### Tests
Some Unit tests were created to cover the yaml file

Test Coverage
---------------
- BDD test cases were written using Cucumber and Gherkin 
- The feature files are located in the folder -> src -> test -> resource -> features

