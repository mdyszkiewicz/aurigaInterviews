# aurigaInterviews

# Easy testing

After running the app, for examle with the built in spring-boot maven wrapper:
```
mvnw spring-boot:run
```
you can visit http://localhost:8080 and use the simple web interface to check if the __/filter__ endpoint really works (of course you can use any other facility like Postman, but the web based one is already setup, and ready to go, with the proper headers, etc.).

On the code side, take a look at the ```InputControllerTest```, which tests the controller on development level, which really helps to avoid regressions in the future.

# Eome explanations

The instructions were to parse input starting with "\[" that means a list, so we need to tell it to the parser, hence I'm using List as the main parameter of the Controller. 

The list contains JsonEntries, as I suppose the parameter name "2b727991-5ddb-4a42-82eb-13bbb2876a28" is dynamic, so the JsonEntry (an idea of JSON object with dynamic parameters) is parsed via @JsonAnySetter annotation (we don't need to know the name of the parameter that way) to store only the value of it's single parameter. 

That value contains fields for the actual FilteredContents we want to return to the client and we're doing that with jackson (spring boot default) ant it's annotations (facilitating for eg. parsing the date) on that class.

# Contace info
I may be hard to reach in the upcoming 2 weeks (I'll try to be online once a day though - please keep that in mind in case of questions).
