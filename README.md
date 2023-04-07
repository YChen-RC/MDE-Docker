## 1. Project's Title

### DSML Choice and Rational(With Xtext and Xpect)




## 2. Project Description

### Docker as the DSML for this project because it is widely adopted, well-developed, and recommended in the official documentation. Additionally, many popular GitHub projects include a Dockerfile in their repositories, and learning Docker is not overly complex. This project is a small and simple IDE created by eclipse and Xtext and Xpect plugins which will run by one of the DSML language such as Docker.

### Each Dockerfile instruction has specific argument requirements and limits that need to be validated. For instance, the FROM instruction accepts three formats:




the example of some part we implemented in this IDE  such as :




- Check for a valid FROM command

 -Check for duplicate commands that should appear only once

 -Validate CMD and ENTRYPOINT compatibility

- Validate EXPOSE command port range

-  Checking the format if the output was json file

 - CMD from techniq are exist

  - Checking to make sure WORKDIR is empty, If WORKDIR is empty then shows error

   - Checking the export port be correct

   

``` FROM [--platform=<platform>] <image> [AS <name>]```




### I will implement validation rules to ensure that the arguments provided for each instruction meet the required format and constraints.





## 3. How to Install and Run the Project






## 4. Credits

The simple IDe with Validate compatibility created by Mis. Chen & Mr.Mehrnami
