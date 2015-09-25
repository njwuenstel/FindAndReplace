# Week 1

## Welcome to Enterprise Java! 

### When you arrive:
1. Sign in on the paper sign in sheet.
2. If you have not completed the prework for this class, refer to the announcement in Blackboard and at minimum, complete the GitHub portion so that you have access to the syllabus and week 1 course materials.  

## Introductions
1. Name.
1. Do you have experience with IntelliJ or another Java IDE? Git or other source control? 
1. If you had a summer internship or IT related job:
	* Where did you work?
	* What was your role?
	* What project/s did you work on?
1. Show the class something from your wallet/bag/purse that helps the group understand who you are.

## Course Overview
1. Syllabus
1. Course goals
1. Course flow
1. Grading - 2 extracurriculars, class participation, team project, individual project. 

## Environment SetUp and Practice

### IntelliJ IDEA

1. Installation
1. Getting Started
     1. Resources
	 1. [Running IntelliJ for the first time](https://www.jetbrains.com/idea/help/running-intellij-idea-ultimate-for-the-first-time.html)   
1. [Java Application](https://www.jetbrains.com/idea/help/creating-and-running-your-first-java-application.html) 
1. [Java Web Application](https://www.jetbrains.com/idea/help/developing-a-java-ee-application.html) 
IMPORTANT: Java Web Application support is only provided in the Ultimate edition of IntelliJ. The school computers currently have the Community edition installed, but will have Ultimate installed in the next couple weeks. Your options for completing this portion are to either complete it on your own computer where you have Ultimate installed, or install the Ultimate edition on a school computer (note that when the computer is restarted, the computer will be re-imaged, meaning Ultimate will be removed). 
	* You will need to install a web server to deploy/test the web application.
	* Download and Install [Tomcat 8](http://tomcat.apache.org/download-80.cgi)
	* Essentially you will download a compressed file containing the server files. Unpack that file on your machine in its own directory.  
	* In Advanced Java, we had a few ant tasks to help us manage the server.  Review RUNNING.txt in the tomcat directory you just created to learn how to start and stop the server.  Make sure the server works before you attempt to use the server from within IntelliJ!
	* You will also need to configure Tomcat in IntelliJ. Remember, Google is your friend: putting together the right search can land you exactly on the page you need. Searching “add application server in IntelliJ” returned several possible resources including "Defining Application Servers in IntelliJ", which is exactly what we need.

**Question:** In Advanced Java, we used the tomcat directory to view our exploded war files. Where can we view our exploded war files in our new environment?  

### Java Warm-up and Practice with IntelliJ

1. Pair up with a partner of your choosing. 
1. Write a find and replace program in Java that performs the following:
    1. Read in a file that contains place holder text. A sample file for you to use is [here](input.txt).
    1. Read in a csv file that contains the placeholder words and the words that should be inserted wherever the placeholders are found. A sample file for you to use is [here](findandreplace.txt).
	1. Find and replace each placeholder word with the proper value.
    1. Create a new file with the replaced words.

* IntelliJ, and most IDEs, have many features to help you be a very efficient programmer. You will discover many of those features on your own as you work through this exercise.  To help guide you, discover the answers to the following:
	1. When you create a new class, there are some comments inserted into the class automatically. IntelliJ uses templates for this. How can you change or create a template to insert proper javadoc comments (@author, for example) each time a new class is created? Hint: check out “File and Code Templates” in Intellij’s Help.
	1. How do you generate code, like constructors, getters, setters?
	1. How do you easily access javadoc for a given class, for example, BufferedReader?
	1. How do you view what methods are available on a class?
	1. How do you automatically add exception handling code? A try - catch block for example? Which style try block is added? Try with resources or the regular try-catch-finally?
	1. Keep track of other handy items you discover, we will create a list of tips as a class.  

### Git and GitHub