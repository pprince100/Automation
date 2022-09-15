I have used POM Framework with TestNG to develop this Automation Script
I have created a Maven based Java project in IntelliJ
The Project structure is as follows, under src>main>java I have created 3 different packages
base,config and pages. And under src>test>java I have created 1 package with Test
Base package contains TestBase which has initialization, webdriverwait and config.properties file path
Config package contains config.properties which has all static data
Pages package contains all the pages of the project
Test package contains all the Test we want to run
pom.xml has all the required dependencies to run the Automation Script
I have used webdriver manager dependency which help me to manage chrome driver by automatically
using the latest chromedrive compatible with chrome version installed in the system.
I have also used webdrivewait to wait until a particular element is visible
I have pushed the scrip to Github, repository detail is mentioned below

Github Repository: https://github.com/pprince100/Automation.git
To clone the project use: git clone https://github.com/pprince100/Automation.git