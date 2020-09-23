# Team Github Exercise
COSC 499 Assignment 2

## Project Setup

To setup this project on your local machine, you must have maven installed (instructions on how to do this can be found [here](https://howtodoinjava.com/maven/how-to-install-maven-on-windows/))

After cloning the project, navigate to the main project folder (contains src folder) and run the command "mvn clean install -U". For development, your IDE may need additional configuration. For example, on IntelliJ you may need to right-click the pom.xml file or the project folder and click Maven -> Reimport.

## Features

### Addition
The addition feature takes in two values and add them together to give the output. 

```
/add?value1=4&value2=2
```

### Multiplication
The multiplication feature takes in two values and multiplies them together to give the product. 

```
/multiplication?value1=4&value2=2
```

### Division
The divsion feature takes in two values and divides them to give the output. 

```
/div?value1=4&value2=2
```

### Subtraction
The Subtraction feature takes in two values and subtracts them to give the output. 

```
/sub?value1=4&value2=2
```

## How to use
Currently they can be accessed through the test and ran with the result.

## Future work
Add more functionality to the API than the current access through tests.