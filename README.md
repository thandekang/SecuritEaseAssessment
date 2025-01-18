# SecuritEaseAssessment

This file is going to take us step by step on how to setup the project and execution

## Tools needed in this oproject
* JDK
* IntelliJ
* Maven

## Maven Dependencies
* selenium - latest version
* testNg - latest version
* cucumber for java
* cucumber testng
* extent report
*
## Project Structure
This is the page object model BDD framework, where by all the tests are separated to its pages for easy maintaince
* Java - Contains all the different packages required for the framework
* Helpers - This where we control the browsers
* Pages - This package contains classes for different pages in a project
* Steps - In this class we have the step defination and the base class where we do the instances of all the page classes
* Runners - We have the runner class here which we use to execute the project
* Features - This is the feature file where we create the scenarios

## Reporting
* The report will be saved under the folder test-output
* To open the report - you have to launch it with a browser of your choice

## Execution
choose any of the below option to execute your project locally
* mvn clean test
* Run the runner class

## Pipeline
The below shows different way to trigger the pipeline build
* push something to the main branch - the build will  be triggered automatically
* trigger the build direct from github actions

## Report in the pipeline
* Open the specific build you want to view the report for and download the artifact which will download as a zip file to your local drive (downloads)